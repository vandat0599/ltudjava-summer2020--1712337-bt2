/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltudjava.summer2020.pkg1712337.bt2.java.module;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import ltudjava.summer2020.pkg1712337.bt2.java.dao.LopHocDao;
import ltudjava.summer2020.pkg1712337.bt2.java.dao.SinhVienDao;
import ltudjava.summer2020.pkg1712337.bt2.java.pojo.LopHoc;
import ltudjava.summer2020.pkg1712337.bt2.java.pojo.SinhVien;

/**
 *
 * @author user
 */
public class QLSV extends javax.swing.JFrame {

    /**
     * Creates new form QLSV
     */
    public QLSV() {
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

        csvChooser = new javax.swing.JFileChooser();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textFieldHoTen = new javax.swing.JTextField();
        textFieldMssv = new javax.swing.JTextField();
        textFieldCMND = new javax.swing.JTextField();
        textFieldGioiTinh = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelSinhVien = new javax.swing.JTable();
        importButton = new java.awt.Button();
        addButton = new java.awt.Button();
        refreshButton = new javax.swing.JButton();
        maLopComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("MSSV");

        jLabel2.setText("Họ Tên");

        jLabel3.setText("Giới Tính");

        jLabel4.setText("CMND");

        jLabel5.setText("Mã Lớp");

        tabelSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelSinhVien);

        importButton.setLabel("Import");
        importButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importButtonActionPerformed(evt);
            }
        });

        addButton.setLabel("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Reset");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        maLopComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(textFieldMssv, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(textFieldGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(textFieldCMND, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(maLopComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(backButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(importButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(refreshButton)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textFieldMssv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textFieldHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textFieldGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textFieldCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(maLopComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(importButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(refreshButton))
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        GiaoVuHome gv = new GiaoVuHome();
        this.setVisible(false);
        gv.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        resetSinhVienForm();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        SinhVienDao dao = new SinhVienDao();
        dao.create(getSinhVienFromForm());
        reloadData();
    }//GEN-LAST:event_addButtonActionPerformed

    private void importButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importButtonActionPerformed
        // TODO add your handling code here:
        LopHocDao lopHocDao = new LopHocDao();
        SinhVienDao sinhVienDao = new SinhVienDao();
        if (csvChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            List<String> list = new ArrayList<>();
            try (BufferedReader br = Files.newBufferedReader(Paths.get(csvChooser.getSelectedFile().getAbsolutePath()))) {
                    //br returns as stream and convert it into a List
                    list = br.lines().collect(Collectors.toList());
            } catch (IOException e) {
                    e.printStackTrace();
            }
            if (!lopHocDao.isExistLopHoc(list.get(0))){
                lopHocDao.create(new LopHoc(list.get(0)));
            }
            for (int i =2;i < list.size();i++){
                String[] line = list.get(i).split(",");
                sinhVienDao.create(new SinhVien(line[1], line[2], line[3], line[4], new LopHoc(list.get(0))));
            }
        } else {
            // user changed their mind
            JOptionPane.showMessageDialog(null, "Something went wrong, please try again!!", "Error!" , JOptionPane.INFORMATION_MESSAGE);
        }
        reloadData();
    }//GEN-LAST:event_importButtonActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSV().setVisible(true);
            }
        });
    }
    
    private void reloadData(){
        SinhVienDao dao = new SinhVienDao();
        List<SinhVien> svData = dao.getList();
        String[][] data = new String[svData.size()][5];
        for (int i=0;i<svData.size();i++){
            data[i][0] = String.valueOf(i+1);
            data[i][1] = svData.get(i).getMssv();
            data[i][2] = svData.get(i).getHoTen();
            data[i][3] = svData.get(i).getGioiTinh();
            data[i][4] = svData.get(i).getCmnd();
        }
        tabelSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            data,
            new String [] {
                "STT", "MSSV", "Họ Tên", "Giới Tính", "CMND"
            }
        ));
        LopHocDao lopHocDao = new LopHocDao();
        List<LopHoc> lhs = lopHocDao.getList();
        String[] lhData = new String[lhs.size()];
        for (int i=0;i<lhs.size();i++){
            lhData[i] = lhs.get(i).getMaLopHoc();
        }
        maLopComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(lhData));
    }
    
    private SinhVien getSinhVienFromForm(){
        SinhVien sv = new SinhVien();
        sv.setMssv(textFieldMssv.getText());
        sv.setHoTen(textFieldHoTen.getText());
        sv.setGioiTinh(textFieldGioiTinh.getText());
        sv.setCmnd(textFieldCMND.getText());
        sv.setMaLopHoc(new LopHoc(maLopComboBox.getSelectedItem().toString()));
        return sv;
    }
    
    private void resetSinhVienForm(){
        textFieldMssv.setText("");
        textFieldHoTen.setText("");
        textFieldGioiTinh.setText("");
        textFieldCMND.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JFileChooser csvChooser;
    private java.awt.Button importButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> maLopComboBox;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTable tabelSinhVien;
    private javax.swing.JTextField textFieldCMND;
    private javax.swing.JTextField textFieldGioiTinh;
    private javax.swing.JTextField textFieldHoTen;
    private javax.swing.JTextField textFieldMssv;
    // End of variables declaration//GEN-END:variables
}
