package com.dat.studentmanager.dao;

import com.dat.studentmanager.pojo.User;
import com.dat.studentmanager.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AccountDao implements Dao<User>{
    public void create(User value) {
        //check exist before create
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(value);
        tx.commit();
        System.out.println("Create User Successful");
    }

    public List<User> getList() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List data = session.createQuery("FROM User").list();
        List<User> results = new ArrayList<User>();
        for (Object item : data) {
            results.add((User) item);
        }
        tx.commit();
        return results;
    }

    public void update(User value) {
        //check exist before
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(value);
        tx.commit();
        System.out.println("update User Successful");
    }

    public void delete(User value) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(value);
        tx.commit();
        System.out.println("delete User Successful");
    }
}
