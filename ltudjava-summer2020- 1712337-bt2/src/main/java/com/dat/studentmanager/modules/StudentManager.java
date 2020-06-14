package com.dat.studentmanager.modules;

import com.dat.studentmanager.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.hql.internal.ast.util.SessionFactoryHelper;

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
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        System.out.println("session = " + session);
        JFrame frame = new StudentManager("Student Manager");
        frame.setVisible(true);
    }
}
