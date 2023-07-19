/*
 * OSGRSClientUI.java
 *
 * Created on 16 April 2007, 10:55
 */

package OSGRSClient;

import java.io.IOException;
import javax.swing.text.Document;

/**
 *
 * @author  mfernando
 */
public class OSGRSClientUI extends javax.swing.JFrame {
    
    
    
    private double lattitude;
    private double longitude;
    
    String allSatsRequestData;
    String satsInViewRequestData;
    
    
    /** Creates new form OSGRSClientUI */
    public OSGRSClientUI() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        positionPanel = new javax.swing.JPanel();
        latLabel = new javax.swing.JLabel();
        longLabel = new javax.swing.JLabel();
        latTextField = new javax.swing.JTextField();
        longTextField = new javax.swing.JTextField();
        requestDataPanel = new javax.swing.JPanel();
        allSatsLabel = new javax.swing.JLabel();
        satsInViewLabel = new javax.swing.JLabel();
        allSatsNavModelCheckBox = new javax.swing.JCheckBox();
        allSatsAlmanacCheckBox = new javax.swing.JCheckBox();
        allSatsRTICheckBox = new javax.swing.JCheckBox();
        allSatsIonoModelCheckBox = new javax.swing.JCheckBox();
        satsInViewNavModelCheckBox = new javax.swing.JCheckBox();
        allSatsUTCCheckBox = new javax.swing.JCheckBox();
        satsInViewAlmanacCheckBox = new javax.swing.JCheckBox();
        satsInViewRTICheckBox = new javax.swing.JCheckBox();
        satsInViewRefTimeCheckBox = new javax.swing.JCheckBox();
        allSatsRefTimeCheckBox = new javax.swing.JCheckBox();
        clearButton = new javax.swing.JButton();
        sendButton = new javax.swing.JButton();
        responsePanel = new javax.swing.JPanel();
        responseScrollPanel = new javax.swing.JScrollPane();
        responseTextPane = new javax.swing.JTextPane();
        serverPanel = new javax.swing.JPanel();
        urlLabel = new javax.swing.JLabel();
        urlTextField = new javax.swing.JTextField();
        testButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        clientMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OSGRS Client");
        positionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Position Information"));
        latLabel.setText("Latitude");

        longLabel.setText("Longitude");

        latTextField.setText("0.0");
        latTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latTextFieldActionPerformed(evt);
            }
        });

        longTextField.setText("0.0");

        org.jdesktop.layout.GroupLayout positionPanelLayout = new org.jdesktop.layout.GroupLayout(positionPanel);
        positionPanel.setLayout(positionPanelLayout);
        positionPanelLayout.setHorizontalGroup(
            positionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(positionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(positionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(latLabel)
                    .add(longLabel))
                .add(41, 41, 41)
                .add(positionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(longTextField)
                    .add(latTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        positionPanelLayout.setVerticalGroup(
            positionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(positionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(positionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(latLabel)
                    .add(latTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(positionPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(longLabel)
                    .add(longTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        requestDataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Request Data"));
        allSatsLabel.setText("All Sats Data");

        satsInViewLabel.setText("Sats In View Data");

        allSatsNavModelCheckBox.setText("NavModel");
        allSatsNavModelCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        allSatsNavModelCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        allSatsNavModelCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                allSatsNavModelCheckBoxItemStateChanged(evt);
            }
        });

        allSatsAlmanacCheckBox.setText("Almanac");
        allSatsAlmanacCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        allSatsAlmanacCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        allSatsAlmanacCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                allSatsAlmanacCheckBoxItemStateChanged(evt);
            }
        });

        allSatsRTICheckBox.setText("RTI");
        allSatsRTICheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        allSatsRTICheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        allSatsRTICheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                allSatsRTICheckBoxItemStateChanged(evt);
            }
        });

        allSatsIonoModelCheckBox.setText("IonoModel");
        allSatsIonoModelCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        allSatsIonoModelCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        allSatsIonoModelCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                allSatsIonoModelCheckBoxItemStateChanged(evt);
            }
        });

        satsInViewNavModelCheckBox.setText("NavModel");
        satsInViewNavModelCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        satsInViewNavModelCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        satsInViewNavModelCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                satsInViewNavModelCheckBoxItemStateChanged(evt);
            }
        });

        allSatsUTCCheckBox.setText("UTC");
        allSatsUTCCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        allSatsUTCCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        allSatsUTCCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                allSatsUTCCheckBoxItemStateChanged(evt);
            }
        });

        satsInViewAlmanacCheckBox.setText("Almanac");
        satsInViewAlmanacCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        satsInViewAlmanacCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        satsInViewAlmanacCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                satsInViewAlmanacCheckBoxItemStateChanged(evt);
            }
        });

        satsInViewRTICheckBox.setText("RTI");
        satsInViewRTICheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        satsInViewRTICheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        satsInViewRTICheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                satsInViewRTICheckBoxItemStateChanged(evt);
            }
        });

        satsInViewRefTimeCheckBox.setText("RefTime");
        satsInViewRefTimeCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        satsInViewRefTimeCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        satsInViewRefTimeCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                satsInViewRefTimeCheckBoxItemStateChanged(evt);
            }
        });

        allSatsRefTimeCheckBox.setText("RefTime");
        allSatsRefTimeCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        allSatsRefTimeCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout requestDataPanelLayout = new org.jdesktop.layout.GroupLayout(requestDataPanel);
        requestDataPanel.setLayout(requestDataPanelLayout);
        requestDataPanelLayout.setHorizontalGroup(
            requestDataPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(requestDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(requestDataPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(requestDataPanelLayout.createSequentialGroup()
                        .add(requestDataPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(allSatsNavModelCheckBox)
                            .add(allSatsRTICheckBox)
                            .add(allSatsUTCCheckBox))
                        .add(50, 50, 50)
                        .add(requestDataPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(allSatsRefTimeCheckBox)
                            .add(allSatsIonoModelCheckBox)
                            .add(allSatsAlmanacCheckBox)))
                    .add(allSatsLabel))
                .add(43, 43, 43)
                .add(requestDataPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(satsInViewRefTimeCheckBox)
                    .add(satsInViewNavModelCheckBox)
                    .add(satsInViewLabel)
                    .add(satsInViewAlmanacCheckBox)
                    .add(satsInViewRTICheckBox))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        requestDataPanelLayout.setVerticalGroup(
            requestDataPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(requestDataPanelLayout.createSequentialGroup()
                .add(requestDataPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(allSatsLabel)
                    .add(satsInViewLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(requestDataPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(allSatsAlmanacCheckBox)
                    .add(allSatsNavModelCheckBox)
                    .add(satsInViewNavModelCheckBox))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(requestDataPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(allSatsIonoModelCheckBox)
                    .add(allSatsRTICheckBox)
                    .add(satsInViewAlmanacCheckBox))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(requestDataPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(allSatsUTCCheckBox)
                    .add(satsInViewRTICheckBox)
                    .add(allSatsRefTimeCheckBox))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(satsInViewRefTimeCheckBox))
        );

        clearButton.setText("Clear");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        sendButton.setText("Send");
        sendButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendButtonMouseClicked(evt);
            }
        });

        responsePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Response"));
        responsePanel.setRequestFocusEnabled(false);
        responseScrollPanel.setAutoscrolls(true);
        responseScrollPanel.setHorizontalScrollBar(null);
        responseScrollPanel.setViewport(null);
        responseScrollPanel.setViewportView(responseTextPane);

        org.jdesktop.layout.GroupLayout responsePanelLayout = new org.jdesktop.layout.GroupLayout(responsePanel);
        responsePanel.setLayout(responsePanelLayout);
        responsePanelLayout.setHorizontalGroup(
            responsePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(responsePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(responseScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addContainerGap())
        );
        responsePanelLayout.setVerticalGroup(
            responsePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, responsePanelLayout.createSequentialGroup()
                .add(responseScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        serverPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Server"));
        urlLabel.setText("URL:");

        urlTextField.setText("http://10.102.150.23:8080/");

        org.jdesktop.layout.GroupLayout serverPanelLayout = new org.jdesktop.layout.GroupLayout(serverPanel);
        serverPanel.setLayout(serverPanelLayout);
        serverPanelLayout.setHorizontalGroup(
            serverPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(serverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(urlLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 16, Short.MAX_VALUE)
                .add(urlTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 157, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        serverPanelLayout.setVerticalGroup(
            serverPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(serverPanelLayout.createSequentialGroup()
                .add(serverPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(urlLabel)
                    .add(urlTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        testButton.setText("test");
        testButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                testButtonMouseClicked(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });

        fileMenu.setText("File");
        fileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuActionPerformed(evt);
            }
        });

        clientMenuBar.add(fileMenu);

        helpMenu.setText("Help");
        helpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuActionPerformed(evt);
            }
        });

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        aboutMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMenuItemMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aboutMenuItemMousePressed(evt);
            }
        });

        helpMenu.add(aboutMenuItem);

        clientMenuBar.add(helpMenu);

        setJMenuBar(clientMenuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(responsePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(layout.createSequentialGroup()
                                .add(serverPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 364, Short.MAX_VALUE)
                                .add(testButton)))
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(requestDataPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(resetButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(clearButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(sendButton))
                            .add(positionPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(serverPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(positionPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(sendButton)
                                    .add(resetButton)
                                    .add(clearButton)))
                            .add(requestDataPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(testButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(responsePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseClicked
// TODO add your handling code here:
        this.allSatsAlmanacCheckBox.setSelected(false);
        this.allSatsIonoModelCheckBox.setSelected(false);
        this.allSatsNavModelCheckBox.setSelected(false);
        this.allSatsRTICheckBox.setSelected(false);
        this.allSatsRefTimeCheckBox.setSelected(false);
        this.allSatsUTCCheckBox.setSelected(false);
        
        this.satsInViewAlmanacCheckBox.setSelected(false);
        this.satsInViewNavModelCheckBox.setSelected(false);
        this.satsInViewRTICheckBox.setSelected(false);
        this.satsInViewRefTimeCheckBox.setSelected(false);
        
        this.latTextField.setText("0.0");
        this.longTextField.setText("0.0");
    }//GEN-LAST:event_resetButtonMouseClicked

    private void testButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testButtonMouseClicked
// TODO add your handling code here:
        System.out.println("testButtonMouseClicked");
        prepareRequest();
        System.out.println("allSatsRequestData: \"" + this.allSatsRequestData + "\"");
        System.out.println("satsInViewRequestData: \"" + this.satsInViewRequestData + "\"");
        System.out.println("URL: " + this.urlTextField.getText());
        System.out.println("latitude: " + this.lattitude);
        System.out.println("longitude: " + this.longitude);
    }//GEN-LAST:event_testButtonMouseClicked

    private void satsInViewRefTimeCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_satsInViewRefTimeCheckBoxItemStateChanged
// TODO add your handling code here:
        System.out.println("satsInViewRefTimeCheckBoxItemStateChanged" + " " + evt.getStateChange());
        
        if(evt.getStateChange() == evt.SELECTED)
        {
            System.out.println("satsInViewRefTime selected");
        } else
        if(evt.getStateChange() == evt.DESELECTED)
        {
            System.out.println("satsInViewRefTime deselected");
        }
    }//GEN-LAST:event_satsInViewRefTimeCheckBoxItemStateChanged

    private void satsInViewRTICheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_satsInViewRTICheckBoxItemStateChanged
// TODO add your handling code here:
        System.out.println("satsInViewRTICheckBoxItemStateChanged" + " " + evt.getStateChange());
        
        if(evt.getStateChange() == evt.SELECTED)
        {
            System.out.println("satsInViewRTI selected");
        } else
        if(evt.getStateChange() == evt.DESELECTED)
        {
            System.out.println("satsInViewRTI deselected");
        }
    }//GEN-LAST:event_satsInViewRTICheckBoxItemStateChanged

    private void satsInViewAlmanacCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_satsInViewAlmanacCheckBoxItemStateChanged
// TODO add your handling code here:
        System.out.println("satsInViewAlmanacCheckBoxItemStateChanged" + " " + evt.getStateChange());
        
        if(evt.getStateChange() == evt.SELECTED)
        {
            System.out.println("satsInViewAlmanac selected");
        } else
        if(evt.getStateChange() == evt.DESELECTED)
        {
            System.out.println("satsInViewAlmanac deselected");
        }
    }//GEN-LAST:event_satsInViewAlmanacCheckBoxItemStateChanged

    private void satsInViewNavModelCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_satsInViewNavModelCheckBoxItemStateChanged
// TODO add your handling code here:
        System.out.println("satsInViewNavModelCheckBoxItemStateChanged" + " " + evt.getStateChange());
        
        if(evt.getStateChange() == evt.SELECTED)
        {
            System.out.println("satsInViewNavModel selected");
        } else
        if(evt.getStateChange() == evt.DESELECTED)
        {
            System.out.println("satsInViewNavModel deselected");
        }
    }//GEN-LAST:event_satsInViewNavModelCheckBoxItemStateChanged

    private void allSatsUTCCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_allSatsUTCCheckBoxItemStateChanged
// TODO add your handling code here:
        System.out.println("allSatsUTCCheckBoxItemStateChanged" + " " + evt.getStateChange());
        
        if(evt.getStateChange() == evt.SELECTED)
        {
            System.out.println("allSatsUTC selected");
        } else
        if(evt.getStateChange() == evt.DESELECTED)
        {
            System.out.println("allSatsUTC deselected");
        }
    }//GEN-LAST:event_allSatsUTCCheckBoxItemStateChanged

    private void allSatsIonoModelCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_allSatsIonoModelCheckBoxItemStateChanged
// TODO add your handling code here:
        System.out.println("allSatsIonoModelCheckBoxItemStateChanged" + " " + evt.getStateChange());
        
        if(evt.getStateChange() == evt.SELECTED)
        {
            System.out.println("allSatsIonoModel selected");
        } else
        if(evt.getStateChange() == evt.DESELECTED)
        {
            System.out.println("allSatsIonoModel deselected");
        }
    }//GEN-LAST:event_allSatsIonoModelCheckBoxItemStateChanged

    private void allSatsRTICheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_allSatsRTICheckBoxItemStateChanged
// TODO add your handling code here:
        System.out.println("allSatsRTICheckBoxItemStateChanged" + " " + evt.getStateChange());
        
        if(evt.getStateChange() == evt.SELECTED)
        {
            System.out.println("allSatsRTI selected");
        } else
        if(evt.getStateChange() == evt.DESELECTED)
        {
            System.out.println("allSatsRTI deselected");
        }
    }//GEN-LAST:event_allSatsRTICheckBoxItemStateChanged

    private void allSatsAlmanacCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_allSatsAlmanacCheckBoxItemStateChanged
// TODO add your handling code here:
        System.out.println("allSatsAlmanacCheckBoxItemStateChanged" + " " + evt.getStateChange());
        
        if(evt.getStateChange() == evt.SELECTED)
        {
            System.out.println("allSatsAlmanac selected");
        } else
        if(evt.getStateChange() == evt.DESELECTED)
        {
            System.out.println("allSatsAlmanac deselected");
        }
    }//GEN-LAST:event_allSatsAlmanacCheckBoxItemStateChanged

    private void allSatsNavModelCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_allSatsNavModelCheckBoxItemStateChanged
// TODO add your handling code here:
        System.out.println("allSatsNavModelCheckBoxItemStateChanged" + " " + evt.getStateChange());
        
        if(evt.getStateChange() == evt.SELECTED)
        {
            System.out.println("allSatsNavModel selected");
        } else
        if(evt.getStateChange() == evt.DESELECTED)
        {
            System.out.println("allSatsNavModel deselected");
        }
    }//GEN-LAST:event_allSatsNavModelCheckBoxItemStateChanged

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
// TODO add your handling code here:
        System.out.println("clearButtonMouseClicked" + " " + evt.getButton());
        this.responseTextPane.setText("");
    }//GEN-LAST:event_clearButtonMouseClicked

    private void sendButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendButtonMouseClicked
// TODO add your handling code here:
        System.out.println("sendButtonMouseClicked" + " " + evt.getButton());
        //this.responseTextArea.append("send button was clicked");
        prepareRequest();
    }//GEN-LAST:event_sendButtonMouseClicked

    private void aboutMenuItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuItemMousePressed
// TODO add your handling code here:
        System.out.println("aboutMenuItemMousePressed" + evt.getButton());
        
    }//GEN-LAST:event_aboutMenuItemMousePressed

    private void aboutMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuItemMouseClicked
// TODO add your handling code here:
        //System.out.println("aboutMenuItemMouseClicked");
    }//GEN-LAST:event_aboutMenuItemMouseClicked

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
// TODO add your handling code here:         
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void helpMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_helpMenuActionPerformed

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_fileMenuActionPerformed

    private void latTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latTextFieldActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_latTextFieldActionPerformed
    
    private void prepareRequest()//not finished yet
    {
        this.lattitude = Double.parseDouble(this.latTextField.getText());
        this.longitude = Double.parseDouble(this.longTextField.getText());
        
        
        
        
        writeAllSatsDataString();
        writeSatsInViewDataString();
        
        
        
        OSGRSClientRequest osgrsClientRequest = new OSGRSClientRequest(this.allSatsRequestData, this.satsInViewRequestData,
                this.urlTextField.getText(), this.lattitude, this.longitude);
        try {
            
            Document doc = responseTextPane.getDocument(); //to reset strem description property
            doc.putProperty(Document.StreamDescriptionProperty, null);
            
            this.responseTextPane.setPage("file:///" + "D:/ANSA/My Documents/osgrs logs/testClientLogs/GNSSResponse.xml");
            //this.responseTextPane.repaint();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private void writeAllSatsDataString()//test this!
    {
        this.allSatsRequestData = "";
        
        if(this.allSatsNavModelCheckBox.isSelected())
        {
            this.allSatsRequestData = "Navmodel ";
        }
        if(this.allSatsAlmanacCheckBox.isSelected())
        {
            this.allSatsRequestData = this.allSatsRequestData + "Almanac ";
        }
        if(this.allSatsIonoModelCheckBox.isSelected())
        {
            this.allSatsRequestData = this.allSatsRequestData + "IonoModel ";
        }
        if(this.allSatsRTICheckBox.isSelected())
        {
            this.allSatsRequestData = this.allSatsRequestData + "RTI ";
        }
        if(this.allSatsUTCCheckBox.isSelected())
        {
            this.allSatsRequestData = this.allSatsRequestData + "UTC ";
        }
        if(this.allSatsRefTimeCheckBox.isSelected())
        {
            this.allSatsRequestData = this.allSatsRequestData + "RefTime";
        }
        
        if((this.allSatsRequestData.length() > 1)&&(this.allSatsRequestData.charAt(this.allSatsRequestData.length()-1) == ' '))
        {
            this.allSatsRequestData = this.allSatsRequestData.substring(0, this.allSatsRequestData.length() - 1);
        }
        
        if(this.allSatsRequestData.equals(""))
        {
            this.allSatsRequestData = null;
        }
    }
    
    private void writeSatsInViewDataString()//test this
    {
        this.satsInViewRequestData = "";
        
        if(this.satsInViewNavModelCheckBox.isSelected())
        {
            this.satsInViewRequestData = "Navmodel ";
        }
        if(this.satsInViewAlmanacCheckBox.isSelected())
        {
            this.satsInViewRequestData = this.satsInViewRequestData + "Almanac ";
        }
        if(this.satsInViewRTICheckBox.isSelected())
        {
            this.satsInViewRequestData = this.satsInViewRequestData + "RTI ";
        }
        if(this.satsInViewRefTimeCheckBox.isSelected())
        {
            this.satsInViewRequestData = this.satsInViewRequestData + "RefTime";
        }
        
        if((this.satsInViewRequestData.length() > 1)&&(this.satsInViewRequestData.charAt(this.satsInViewRequestData.length()-1) == ' '))
        {
            this.satsInViewRequestData = this.satsInViewRequestData.substring(0, this.satsInViewRequestData.length() - 1);
        }
        
        if(this.satsInViewRequestData.equals(""))
        {
            this.satsInViewRequestData = null;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OSGRSClientUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JCheckBox allSatsAlmanacCheckBox;
    private javax.swing.JCheckBox allSatsIonoModelCheckBox;
    private javax.swing.JLabel allSatsLabel;
    private javax.swing.JCheckBox allSatsNavModelCheckBox;
    private javax.swing.JCheckBox allSatsRTICheckBox;
    private javax.swing.JCheckBox allSatsRefTimeCheckBox;
    private javax.swing.JCheckBox allSatsUTCCheckBox;
    private javax.swing.JButton clearButton;
    private javax.swing.JMenuBar clientMenuBar;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel latLabel;
    private javax.swing.JTextField latTextField;
    private javax.swing.JLabel longLabel;
    private javax.swing.JTextField longTextField;
    private javax.swing.JPanel positionPanel;
    private javax.swing.JPanel requestDataPanel;
    private javax.swing.JButton resetButton;
    private javax.swing.JPanel responsePanel;
    private javax.swing.JScrollPane responseScrollPanel;
    private javax.swing.JTextPane responseTextPane;
    private javax.swing.JCheckBox satsInViewAlmanacCheckBox;
    private javax.swing.JLabel satsInViewLabel;
    private javax.swing.JCheckBox satsInViewNavModelCheckBox;
    private javax.swing.JCheckBox satsInViewRTICheckBox;
    private javax.swing.JCheckBox satsInViewRefTimeCheckBox;
    private javax.swing.JButton sendButton;
    private javax.swing.JPanel serverPanel;
    private javax.swing.JButton testButton;
    private javax.swing.JLabel urlLabel;
    private javax.swing.JTextField urlTextField;
    // End of variables declaration//GEN-END:variables
    
}
