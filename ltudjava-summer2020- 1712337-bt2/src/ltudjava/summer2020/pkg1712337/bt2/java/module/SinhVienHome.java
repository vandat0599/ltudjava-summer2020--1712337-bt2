/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltudjava.summer2020.pkg1712337.bt2.java.module;

import ltudjava.summer2020.pkg1712337.bt2.java.pojo.SinhVien;
import ltudjava.summer2020.pkg1712337.bt2.java.pojo.User;
import ltudjava.summer2020.pkg1712337.bt2.java.util.FileUtils;

/**
 *
 * @author user
 */
public class SinhVienHome extends javax.swing.JFrame {

    /**
     * Creates new form SinhVienHome
     */
    public SinhVienHome() {
        initComponents();
        reloadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xemDiemButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        phucKhaoButton = new javax.swing.JButton();
        doiMKButton = new javax.swing.JButton();
        dangXuatButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        xemDiemButton.setText("Xem Điểm");
        xemDiemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xemDiemButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Sinh Viên: 1712337");

        phucKhaoButton.setText("Phúc Khảo");

        doiMKButton.setText("Đổi Mật Khẩu");
        doiMKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doiMKButtonActionPerformed(evt);
            }
        });

        dangXuatButton.setText("Đăng Xuất");
        dangXuatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangXuatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dangXuatButton)
                    .addComponent(doiMKButton)
                    .addComponent(phucKhaoButton)
                    .addComponent(xemDiemButton)
                    .addComponent(jLabel1))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(xemDiemButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phucKhaoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(doiMKButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dangXuatButton)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doiMKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doiMKButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        DoiMK m = new DoiMK();
        m.setVisible(true);
        
    }//GEN-LAST:event_doiMKButtonActionPerformed

    private void xemDiemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xemDiemButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SVXemDiem sv = new SVXemDiem();
        sv.setVisible(true);
    }//GEN-LAST:event_xemDiemButtonActionPerformed

    private void dangXuatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangXuatButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_dangXuatButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SinhVienHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinhVienHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinhVienHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinhVienHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinhVienHome().setVisible(true);
            }
        });
    }
    
    private void reloadData(){
        User sv = FileUtils.getObject(User.class, "user.txt");
        jLabel1.setText("Sinh Viên: " + sv.getUserName());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dangXuatButton;
    private javax.swing.JButton doiMKButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton phucKhaoButton;
    private javax.swing.JButton xemDiemButton;
    // End of variables declaration//GEN-END:variables
}
