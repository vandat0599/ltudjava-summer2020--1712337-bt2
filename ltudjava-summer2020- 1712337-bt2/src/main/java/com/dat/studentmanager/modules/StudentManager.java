package com.dat.studentmanager.modules;

import com.dat.studentmanager.pojo.SinhVien;
import com.dat.studentmanager.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.hql.internal.ast.util.SessionFactoryHelper;

import javax.swing.*;
import java.util.Iterator;
import java.util.List;

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
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        System.out.println("session = " + session);
        Transaction tx = session.beginTransaction();
        List sinhViens = session.createQuery("FROM SinhVien").list();
        for (Iterator iterator = sinhViens.iterator(); iterator.hasNext();){
            SinhVien employee = (SinhVien) iterator.next();
            System.out.print("mssv: " + employee.getMssv());
            System.out.print("cmnd: " + employee.getCmnd());
            System.out.println("gioi tinh: " + employee.getGioiTinh());
        }
        tx.commit();
    }
}
