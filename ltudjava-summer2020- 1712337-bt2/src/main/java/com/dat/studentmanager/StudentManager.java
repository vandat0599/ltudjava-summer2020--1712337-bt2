package com.dat.studentmanager;

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
        JFrame frame = new StudentManager("Student Manager");
        frame.setVisible(true);
    }
}
