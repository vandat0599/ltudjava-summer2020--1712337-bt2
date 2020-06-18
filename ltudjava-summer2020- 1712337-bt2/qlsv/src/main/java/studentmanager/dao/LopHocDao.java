package studentmanager.dao;

import studentmanager.pojo.LopHoc;
import studentmanager.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class LopHocDao implements Dao<LopHoc> {

    public void create(LopHoc lopHoc) {
        //check exist before create
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(lopHoc);
        tx.commit();
        System.out.println("Create lopHoc Successful");
    }

    public List<LopHoc> getList() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List data = session.createQuery("FROM LopHoc").list();
        List<LopHoc> results = new ArrayList<LopHoc>();
        for (Object item : data) {
            results.add((LopHoc) item);
        }
        tx.commit();
        return results;
    }

    public void update(LopHoc lopHoc) {
        //check exist before
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(lopHoc);
        tx.commit();
        System.out.println("update LopHoc Successful");
    }

    public void delete(LopHoc lopHoc) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(lopHoc);
        tx.commit();
        System.out.println("delete LopHoc Successful");
    }
}
