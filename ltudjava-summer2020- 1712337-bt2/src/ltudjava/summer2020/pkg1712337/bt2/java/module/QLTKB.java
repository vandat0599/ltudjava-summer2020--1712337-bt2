/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltudjava.summer2020.pkg1712337.bt2.java.module;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import ltudjava.summer2020.pkg1712337.bt2.java.dao.LopHocDao;
import ltudjava.summer2020.pkg1712337.bt2.java.dao.MonHocDao;
import ltudjava.summer2020.pkg1712337.bt2.java.dao.SinhVienDao;
import ltudjava.summer2020.pkg1712337.bt2.java.pojo.LopHoc;
import ltudjava.summer2020.pkg1712337.bt2.java.pojo.MonHoc;
import ltudjava.summer2020.pkg1712337.bt2.java.pojo.SinhVien;

/**
 *
 * @author user
 */
public class QLTKB extends javax.swing.JFrame {

    /**
     * Creates new form QLTKB
     */
    public QLTKB() {
        initComponents();
        initView();
        reloadData("All");
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
        lopHocComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTKB = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        importButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lopHocComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tableTKB.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableTKB);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        importButton.setText("Import");
        importButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(83, 83, 83)
                        .addComponent(importButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lopHocComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lopHocComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(importButton))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        GiaoVuHome gv = new GiaoVuHome();
        gv.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void importButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importButtonActionPerformed
        // TODO add your handling code here:
        LopHocDao lopHocDao = new LopHocDao();
        MonHocDao monHocDao = new MonHocDao();
        
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
                monHocDao.create(new MonHoc(line[1], line[2], line[3], new LopHoc(list.get(0))));
            }
            reloadData(lopHocComboBox.getSelectedItem().toString());
        } else {
            // user changed their mind
            JOptionPane.showMessageDialog(null, "Something went wrong, please try again!!", "Error!" , JOptionPane.INFORMATION_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(QLTKB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLTKB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLTKB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLTKB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLTKB().setVisible(true);
            }
        });
    }
    
    private void initView(){
        LopHocDao lopHocDao = new LopHocDao();
        List<LopHoc> lhs = lopHocDao.getList();
        String[] lhData = new String[lhs.size() + 1];
        lhData[0] = "All";
        for (int i=0;i<lhs.size();i++){
            lhData[i+1] = lhs.get(i).getMaLopHoc();
        }
        lopHocComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(lhData));
        lopHocComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                reloadData(e.getItem().toString());
                System.out.println(e.getItem().toString());
            }
        });
    }
    
    private void reloadData(String maLop){
        MonHocDao dao = new MonHocDao();
        LopHocDao lopHocDao = new LopHocDao();
        List<MonHoc> mhData = lopHocDao.getMonHocByMaLop(maLop);
        String[][] data = new String[mhData.size()][4];
        for (int i=0;i<mhData.size();i++){
            data[i][0] = String.valueOf(i+1);
                data[i][1] = mhData.get(i).getMaMonHoc();
                data[i][2] = mhData.get(i).getTenMonHoc();
                data[i][3] = mhData.get(i).getPhongHoc();
        }
        tableTKB.setModel(new javax.swing.table.DefaultTableModel(
            data,
            new String [] {
                "STT", "Mã Môn", "Tên Môn", "hòng Học"
            }
        ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JFileChooser csvChooser;
    private javax.swing.JButton importButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lopHocComboBox;
    private javax.swing.JTable tableTKB;
    // End of variables declaration//GEN-END:variables
}
