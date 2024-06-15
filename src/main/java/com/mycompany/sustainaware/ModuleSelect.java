/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sustainaware;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Yahya
 */
public class ModuleSelect extends javax.swing.JFrame {

    private Component CAinfo;
    public static int XP;
    
    public static int envComp = 0;

    /**
     * Creates new form ModuleSelect
     */
    public ModuleSelect() {
        initComponents();
        EnvCompletionLabel.setText("Completion: " + envComp + "%");
        XPLabel.setText("XP: " + XP);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EnvButton = new javax.swing.JButton();
        healthButton = new javax.swing.JButton();
        IniButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        EnvCompletionLabel = new javax.swing.JLabel();
        HealthCompletionLabel = new javax.swing.JLabel();
        IniCompletionLabel = new javax.swing.JLabel();
        XPLabel = new javax.swing.JLabel();
        moreInfoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EnvButton.setText("Environment");
        EnvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnvButtonActionPerformed(evt);
            }
        });

        healthButton.setText("Personal Health");
        healthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthButtonActionPerformed(evt);
            }
        });

        IniButton.setText("Initiatives");
        IniButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("SustainAware");

        EnvCompletionLabel.setText("Completion: 0%");

        HealthCompletionLabel.setText("Completion: 0%");

        IniCompletionLabel.setText("Completion: 0%");

        XPLabel.setText("XP: 0");

        moreInfoButton.setText("?");
        moreInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreInfoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnvButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnvCompletionLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(healthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HealthCompletionLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IniCompletionLabel)
                    .addComponent(IniButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(313, 313, 313))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(XPLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(moreInfoButton)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(XPLabel)
                    .addComponent(moreInfoButton))
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IniButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(healthButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EnvButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnvCompletionLabel)
                    .addComponent(HealthCompletionLabel)
                    .addComponent(IniCompletionLabel))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(814, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EnvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnvButtonActionPerformed
        EnvironmentModule screen = new EnvironmentModule();
        screen.setVisible(true);
        screen.toFront();
        dispose();
    }//GEN-LAST:event_EnvButtonActionPerformed

    private void healthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthButtonActionPerformed
        HealthModule screen = new HealthModule();
        screen.setVisible(true);
        screen.toFront();
        dispose();
    }//GEN-LAST:event_healthButtonActionPerformed

    private void IniButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniButtonActionPerformed
        InitiativesModule screen = new InitiativesModule();
        screen.setVisible(true);
        screen.toFront();
        dispose();
    }//GEN-LAST:event_IniButtonActionPerformed

    private void moreInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreInfoButtonActionPerformed
        JOptionPane.showMessageDialog(this.CAinfo, "XP is meant to be a measure of how well you are doing in the course rather then pure completion.\nDoing well increases your XP.");
    }//GEN-LAST:event_moreInfoButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModuleSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuleSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuleSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuleSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuleSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton EnvButton;
    public static javax.swing.JLabel EnvCompletionLabel;
    private javax.swing.JLabel HealthCompletionLabel;
    public static javax.swing.JButton IniButton;
    private javax.swing.JLabel IniCompletionLabel;
    private javax.swing.JLabel XPLabel;
    public static javax.swing.JButton healthButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton moreInfoButton;
    // End of variables declaration//GEN-END:variables
}