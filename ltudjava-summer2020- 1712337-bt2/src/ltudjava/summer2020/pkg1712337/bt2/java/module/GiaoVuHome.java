/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltudjava.summer2020.pkg1712337.bt2.java.module;

/**
 *
 * @author user
 */
public class GiaoVuHome extends javax.swing.JFrame {

    /**
     * Creates new form GiaoVuHome
     */
    public GiaoVuHome() {
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

        qlsvButton = new javax.swing.JButton();
        qltkbButton = new javax.swing.JButton();
        qlLopHocButton = new javax.swing.JButton();
        qlDiemButton = new javax.swing.JButton();
        doimkButton = new javax.swing.JButton();
        dangXuatButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        qlsvButton.setText("Quản lý sinh viên");
        qlsvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qlsvButtonActionPerformed(evt);
            }
        });

        qltkbButton.setText("Quản lý thời khóa biểu");
        qltkbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qltkbButtonActionPerformed(evt);
            }
        });

        qlLopHocButton.setText("Quản lý lớp học");

        qlDiemButton.setText("Quản lý điểm");
        qlDiemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qlDiemButtonActionPerformed(evt);
            }
        });

        doimkButton.setText("Đổi mật khẩu");

        dangXuatButton.setText("Đăng xuất");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dangXuatButton)
                    .addComponent(qltkbButton)
                    .addComponent(qlsvButton)
                    .addComponent(qlLopHocButton)
                    .addComponent(qlDiemButton)
                    .addComponent(doimkButton))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(qlsvButton)
                .addGap(18, 18, 18)
                .addComponent(qltkbButton)
                .addGap(18, 18, 18)
                .addComponent(qlLopHocButton)
                .addGap(18, 18, 18)
                .addComponent(qlDiemButton)
                .addGap(26, 26, 26)
                .addComponent(doimkButton)
                .addGap(18, 18, 18)
                .addComponent(dangXuatButton)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qlsvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qlsvButtonActionPerformed
        // TODO add your handling code here:
        QLSV f = new QLSV();
        this.setVisible(false);
        f.setVisible(true);
    }//GEN-LAST:event_qlsvButtonActionPerformed

    private void qltkbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qltkbButtonActionPerformed
        // TODO add your handling code here:
        QLTKB t = new QLTKB();
        this.setVisible(false);
        t.setVisible(true);
    }//GEN-LAST:event_qltkbButtonActionPerformed

    private void qlDiemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qlDiemButtonActionPerformed
        // TODO add your handling code here:
        QLDIEM d = new QLDIEM();
        this.setVisible(false);
        d.setVisible(true);
    }//GEN-LAST:event_qlDiemButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoVuHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoVuHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoVuHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoVuHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoVuHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dangXuatButton;
    private javax.swing.JButton doimkButton;
    private javax.swing.JButton qlDiemButton;
    private javax.swing.JButton qlLopHocButton;
    private javax.swing.JButton qlsvButton;
    private javax.swing.JButton qltkbButton;
    // End of variables declaration//GEN-END:variables
}
