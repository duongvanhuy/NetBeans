/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Confirm extends javax.swing.JFrame {

    /**
     * Creates new form Confirm
     */
    public Confirm() {
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

        jPanel1 = new javax.swing.JPanel();
        btnYes_No = new javax.swing.JButton();
        btnYes_No_Cancel = new javax.swing.JButton();
        btnOk_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnYes_No.setText("Yes-No");
        btnYes_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYes_NoActionPerformed(evt);
            }
        });

        btnYes_No_Cancel.setText("Yes-No-Cancel");
        btnYes_No_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYes_No_CancelActionPerformed(evt);
            }
        });

        btnOk_cancel.setText("OK-cancel");
        btnOk_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOk_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnYes_No)
                .addGap(37, 37, 37)
                .addComponent(btnYes_No_Cancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnOk_cancel)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnYes_No)
                    .addComponent(btnYes_No_Cancel)
                    .addComponent(btnOk_cancel))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnYes_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYes_NoActionPerformed
        // TODO add your handling code here:
         int result = JOptionPane.showConfirmDialog(null, "Yes_No_Cancel", "Yes_No_Cancel", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Yes");
        }else if(result == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "No");
        }
    }//GEN-LAST:event_btnYes_NoActionPerformed

    private void btnYes_No_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYes_No_CancelActionPerformed
        // TODO add your handling code here:
         int result = JOptionPane.showConfirmDialog(null, "Yes_No_Cancel", "Yes_No_Cancel", JOptionPane.YES_NO_CANCEL_OPTION);
        if(result == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Yes");
        }else if(result == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "No");
        }else{
            JOptionPane.showMessageDialog(null, "Cancel");
        }
    }//GEN-LAST:event_btnYes_No_CancelActionPerformed

    private void btnOk_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOk_cancelActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "OK-Cancel", "OK-Cancel", JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION){
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Cancel");
        }
    }//GEN-LAST:event_btnOk_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk_cancel;
    private javax.swing.JButton btnYes_No;
    private javax.swing.JButton btnYes_No_Cancel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}