package com.dat.studentmanager.modules;

import com.dat.studentmanager.pojo.LopHoc;
import com.dat.studentmanager.pojo.MonHoc;
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
        System.out.println("ok");
        Transaction tx = session.beginTransaction();
        List data = session.createQuery("FROM MonHoc").list();
        for (Iterator iterator = data.iterator(); iterator.hasNext();){
            MonHoc dataList = (MonHoc) iterator.next();
            System.out.println(dataList.getSinhViens().size());
        }
        tx.commit();
    }
}
