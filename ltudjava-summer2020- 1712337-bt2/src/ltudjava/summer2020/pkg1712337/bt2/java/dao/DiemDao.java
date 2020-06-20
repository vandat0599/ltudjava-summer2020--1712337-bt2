package ltudjava.summer2020.pkg1712337.bt2.java.dao;

import ltudjava.summer2020.pkg1712337.bt2.java.pojo.Diem;
import ltudjava.summer2020.pkg1712337.bt2.java.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class DiemDao implements Dao<Diem> {
    public void create(Diem value) {
        //check exist before create
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(value);
        tx.commit();
        System.out.println("Create User Successful");
    }

    public List<Diem> getList() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List data = session.createQuery("FROM User").list();
        List<Diem> results = new ArrayList<Diem>();
        for (Object item : data) {
            results.add((Diem) item);
        }
        tx.commit();
        return results;
    }
    
    public List<Diem> getDiemByMaLopMaMon(String maLop, String maMon) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List data = session.createQuery("FROM Diem").list();
        List<Diem> results = new ArrayList<Diem>();
        for (Object item : data) {
            results.add((Diem) item);
        }
        tx.commit();
        return results;
    }

    public void update(Diem value) {
        //check exist before
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(value);
        tx.commit();
        System.out.println("update User Successful");
    }

    public void delete(Diem value) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(value);
        tx.commit();
        System.out.println("delete User Successful");
    }
}
