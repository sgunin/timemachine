/*============================================================================

  WCSLIB 4.24 - an implementation of the FITS WCS standard.
  Copyright (C) 1995-2014, Mark Calabretta

  This file is part of WCSLIB.

  WCSLIB is free software: you can redistribute it and/or modify it under the
  terms of the GNU Lesser General Public License as published by the Free
  Software Foundation, either version 3 of the License, or (at your option)
  any later version.

  WCSLIB is distributed in the hope that it will be useful, but WITHOUT ANY
  WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
  FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
  more details.

  You should have received a copy of the GNU Lesser General Public License
  along with WCSLIB.  If not, see http://www.gnu.org/licenses.

  Direct correspondence concerning WCSLIB to mark@calabretta.id.au

  Author: Mark Calabretta, Australia Telescope National Facility, CSIRO.
  http://www.atnf.csiro.au/people/Mark.Calabretta
  $Id: lin_f.c,v 4.24 2014/09/18 15:25:01 mcalabre Exp $
*===========================================================================*/

#include <stdio.h>

#include <lin.h>

/* Fortran name mangling. */
#include <wcsconfig_f77.h>
#define linini_  F77_FUNC(linini,  LININI)
#define lincpy_  F77_FUNC(lincpy,  LINCPY)
#define linput_  F77_FUNC(linput,  LINPUT)
#define linget_  F77_FUNC(linget,  LINGET)
#define linfree_ F77_FUNC(linfree, LINFREE)
#define linprt_  F77_FUNC(linprt,  LINPRT)
#define linset_  F77_FUNC(linset,  LINSET)
#define linp2x_  F77_FUNC(linp2x,  LINP2X)
#define linx2p_  F77_FUNC(linx2p,  LINX2P)

#define linptd_  F77_FUNC(linptd,  LINPTD)
#define linpti_  F77_FUNC(linpti,  LINPTI)
#define lingtd_  F77_FUNC(lingtd,  LINGTD)
#define lingti_  F77_FUNC(lingti,  LINGTI)

#define LIN_FLAG   100
#define LIN_NAXIS  101
#define LIN_CRPIX  102
#define LIN_PC     103
#define LIN_CDELT  104

#define LIN_PIXIMG 200
#define LIN_IMGPIX 201
#define LIN_UNITY  202
#define LIN_ERR    203

/*--------------------------------------------------------------------------*/

int linini_(const int *naxis, int *lin)

{
  return linini(1, *naxis, (struct linprm *)lin);
}

/*--------------------------------------------------------------------------*/

int lincpy_(const int *linsrc, int *lindst)

{
  return lincpy(1, (const struct linprm *)linsrc, (struct linprm *)lindst);
}

/*--------------------------------------------------------------------------*/

int linput_(
  int *lin,
  const int *what,
  const void *value,
  const int *i,
  const int *j)

{
  int i0, j0, k;
  const int *ivalp;
  const double *dvalp;
  struct linprm *linp;

  /* Cast pointers. */
  linp  = (struct linprm *)lin;
  ivalp = (const int *)value;
  dvalp = (const double *)value;

  /* Convert 1-relative FITS axis numbers to 0-relative C array indices. */
  i0 = *i - 1;
  j0 = *j - 1;

  linp->flag = 0;

  switch (*what) {
  case LIN_FLAG:
    linp->flag = *ivalp;
    break;
  case LIN_NAXIS:
    linp->naxis = *ivalp;
    break;
  case LIN_CRPIX:
    linp->crpix[i0] = *dvalp;
    break;
  case LIN_PC:
    k = (i0)*(linp->naxis) + (j0);
    *(linp->pc+k) = *dvalp;
    break;
  case LIN_CDELT:
    linp->cdelt[i0] = *dvalp;
    break;
  default:
    return 1;
  }

  return 0;
}

int linptd_( int *lin, const int *what, const double *value,
  const int *i, const int *j)
{
  return linput_(lin, what, value, i, j);
}

int linpti_( int *lin, const int *what, const int *value,
  const int *i, const int *j)
{
  return linput_(lin, what, value, i, j);
}

/*--------------------------------------------------------------------------*/

int linget_(const int *lin, const int *what, void *value)

{
  int i, j, k, naxis;
  int *ivalp;
  double *dvalp;
  const int *ilinp;
  const double *dlinp;
  const struct linprm *linp;

  /* Cast pointers. */
  linp  = (const struct linprm *)lin;
  ivalp = (int *)value;
  dvalp = (double *)value;

  naxis = linp->naxis;

  switch (*what) {
  case LIN_FLAG:
    *ivalp = linp->flag;
    break;
  case LIN_NAXIS:
    *ivalp = naxis;
    break;
  case LIN_CRPIX:
    for (i = 0; i < naxis; i++) {
      *(dvalp++) = linp->crpix[i];
    }
    break;
  case LIN_PC:
    /* C row-major to FORTRAN column-major. */
    for (j = 0; j < naxis; j++) {
      dlinp = linp->pc + j;
      for (i = 0; i < naxis; i++) {
        *(dvalp++) = *dlinp;
        dlinp += naxis;
      }
    }
    break;
  case LIN_CDELT:
    for (i = 0; i < naxis; i++) {
      *(dvalp++) = linp->cdelt[i];
    }
    break;
  case LIN_PIXIMG:
    /* C row-major to FORTRAN column-major. */
    for (j = 0; j < naxis; j++) {
      dlinp = linp->piximg + j;
      for (i = 0; i < naxis; i++) {
        *(dvalp++) = *dlinp;
        dlinp += naxis;
      }
    }
    break;
  case LIN_IMGPIX:
    /* C row-major to FORTRAN column-major. */
    for (j = 0; j < naxis; j++) {
      dlinp = linp->imgpix + j;
      for (i = 0; i < naxis; i++) {
        *(dvalp++) = *dlinp;
        dlinp += naxis;
      }
    }
    break;
  case LIN_UNITY:
    *ivalp = linp->unity;
    break;
  case LIN_ERR:
    /* Copy the contents of the wcserr struct. */
    if (linp->err) {
      ilinp = (int *)(linp->err);
      for (k = 0; k < ERRLEN; k++) {
        *(ivalp++) = *(ilinp++);
      }
    } else {
      for (k = 0; k < ERRLEN; k++) {
        *(ivalp++) = 0;
      }
    }
    break;
  default:
    return 1;
  }

  return 0;
}

int lingtd_(const int *lin, const int *what, double *value)
{
  return linget_(lin, what, value);
}

int lingti_(const int *lin, const int *what, int *value)
{
  return linget_(lin, what, value);
}

/*--------------------------------------------------------------------------*/

int linfree_(int *lin)

{
  return linfree((struct linprm *)lin);
}

/*--------------------------------------------------------------------------*/

int linprt_(int *lin)

{
  /* This may or may not force the Fortran I/O buffers to be flushed.  If
   * not, try CALL FLUSH(6) before calling LINPRT in the Fortran code. */
  fflush(NULL);

  return linprt((struct linprm *)lin);
}

/*--------------------------------------------------------------------------*/

int linset_(int *lin)

{
  return linset((struct linprm *)lin);
}

/*--------------------------------------------------------------------------*/

int linp2x_(
  int *lin,
  const int *ncoord,
  const int *nelem,
  const double pixcrd[],
  double imgcrd[])

{
  return linp2x((struct linprm *)lin, *ncoord, *nelem, pixcrd, imgcrd);
}

/*--------------------------------------------------------------------------*/

int linx2p_(
  int *lin,
  const int *ncoord,
  const int *nelem,
  const double imgcrd[],
  double pixcrd[])

{
  return linx2p((struct linprm *)lin, *ncoord, *nelem, imgcrd, pixcrd);
}
