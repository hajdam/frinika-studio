/*
 * http://www.frinika.com
 * 
 * This file is part of Frinika.
 * 
 * Frinika is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.

 * Frinika is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with Frinika; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package com.frinika.gui.panel;

import com.frinika.gui.util.WindowUtils;

/**
 * Welcome panel for application start.
 *
 * @author hajdam
 */
public class WelcomePanel extends javax.swing.JPanel {

    public WelcomePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lafButtonGroup = new javax.swing.ButtonGroup();
        projectsTabbedPane = new javax.swing.JTabbedPane();
        recentProjectsPanel = new javax.swing.JPanel();
        recentListScrollPane = new javax.swing.JScrollPane();
        recentList = new javax.swing.JList<>();
        sampleProjectsPanel = new javax.swing.JPanel();
        samplListScrollPane = new javax.swing.JScrollPane();
        sampleList = new javax.swing.JList<>();
        newProjectButton = new javax.swing.JButton();
        lafPanel = new javax.swing.JPanel();
        defaultLafToggleButton = new javax.swing.JToggleButton();
        darculaLafToggleButton = new javax.swing.JToggleButton();
        openProjectButton = new javax.swing.JButton();
        optionsPanel = new javax.swing.JPanel();
        configureAudioButton = new javax.swing.JButton();
        controlPanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        animatedLogoPanel1 = new com.frinika.gui.panel.AnimatedLogoPanel();

        recentProjectsPanel.setLayout(new java.awt.BorderLayout());

        recentList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        recentListScrollPane.setViewportView(recentList);

        recentProjectsPanel.add(recentListScrollPane, java.awt.BorderLayout.CENTER);

        projectsTabbedPane.addTab("Recent Projects", recentProjectsPanel);

        sampleProjectsPanel.setLayout(new java.awt.BorderLayout());

        sampleList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        samplListScrollPane.setViewportView(sampleList);

        sampleProjectsPanel.add(samplListScrollPane, java.awt.BorderLayout.CENTER);

        projectsTabbedPane.addTab("Sample Projects", sampleProjectsPanel);

        newProjectButton.setText("Create new project");
        newProjectButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lafPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Look and Feel"));

        lafButtonGroup.add(defaultLafToggleButton);
        defaultLafToggleButton.setText("Default");
        defaultLafToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultLafToggleButtonActionPerformed(evt);
            }
        });

        lafButtonGroup.add(darculaLafToggleButton);
        darculaLafToggleButton.setSelected(true);
        darculaLafToggleButton.setText("Darcula");

        javax.swing.GroupLayout lafPanelLayout = new javax.swing.GroupLayout(lafPanel);
        lafPanel.setLayout(lafPanelLayout);
        lafPanelLayout.setHorizontalGroup(
            lafPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lafPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(defaultLafToggleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(darculaLafToggleButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lafPanelLayout.setVerticalGroup(
            lafPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lafPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(defaultLafToggleButton)
                .addComponent(darculaLafToggleButton))
        );

        openProjectButton.setText("Open project");
        openProjectButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        optionsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

        configureAudioButton.setText("Configure audio...");
        configureAudioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configureAudioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(configureAudioButton)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        optionsPanelLayout.setVerticalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(configureAudioButton, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        closeButton.setText("Close");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projectsTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(openProjectButton, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(newProjectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(animatedLogoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 3, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lafPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(optionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(animatedLogoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newProjectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openProjectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optionsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lafPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(projectsTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void configureAudioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configureAudioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_configureAudioButtonActionPerformed

    private void defaultLafToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultLafToggleButtonActionPerformed
        
    }//GEN-LAST:event_defaultLafToggleButtonActionPerformed

    /**
     * Test method for this panel.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        WindowUtils.invokeDialog(new WelcomePanel());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.frinika.gui.panel.AnimatedLogoPanel animatedLogoPanel1;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton configureAudioButton;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JToggleButton darculaLafToggleButton;
    private javax.swing.JToggleButton defaultLafToggleButton;
    private javax.swing.ButtonGroup lafButtonGroup;
    private javax.swing.JPanel lafPanel;
    private javax.swing.JButton newProjectButton;
    private javax.swing.JButton openProjectButton;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JTabbedPane projectsTabbedPane;
    private javax.swing.JList<String> recentList;
    private javax.swing.JScrollPane recentListScrollPane;
    private javax.swing.JPanel recentProjectsPanel;
    private javax.swing.JScrollPane samplListScrollPane;
    private javax.swing.JList<String> sampleList;
    private javax.swing.JPanel sampleProjectsPanel;
    // End of variables declaration//GEN-END:variables
}