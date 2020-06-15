package com.dat.studentmanager.modules;

import com.dat.studentmanager.dao.SinhVienDao;
import com.dat.studentmanager.pojo.LopHoc;
import com.dat.studentmanager.pojo.SinhVien;

import javax.swing.*;

public class StudentManager extends JFrame {
    private JPanel panelMain;
    private JButton button1;

    public StudentManager(String title){
        super(title);
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main(String[] args){
        SinhVienDao svDao = new SinhVienDao();
        svDao.delete(new SinhVien("8888888", "", "", "", null));
    }
}
