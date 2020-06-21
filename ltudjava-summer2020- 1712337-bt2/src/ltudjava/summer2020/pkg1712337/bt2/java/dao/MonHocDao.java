package ltudjava.summer2020.pkg1712337.bt2.java.dao;

import ltudjava.summer2020.pkg1712337.bt2.java.pojo.MonHoc;
import ltudjava.summer2020.pkg1712337.bt2.java.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import ltudjava.summer2020.pkg1712337.bt2.java.pojo.SinhVien;

public class MonHocDao implements Dao<MonHoc> {
	
    public void create(MonHoc monHoc) {
        //check exist before create
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(monHoc);
        tx.commit();
        System.out.println("Create MonHoc Successful");
    }

    public List<MonHoc> getList() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List data = session.createQuery("FROM MonHoc").list();
        List<MonHoc> results = new ArrayList<MonHoc>();
        for (Object item : data) {
            results.add((MonHoc) item);
        }
        tx.commit();
        return results;
    }
    
    public MonHoc getMonHocByMaMonHoc(String maMonHoc) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List data = session.createQuery("FROM MonHoc where maMonHoc = :maMonHoc")
                .setParameter("maMonHoc", maMonHoc)
                .list();
        List<MonHoc> results = new ArrayList<MonHoc>();
        for (Object item : data) {
            results.add((MonHoc) item);
        }
        tx.commit();
        if (results.size() > 0){
            return results.get(0);
        }
        return null;
    }

    public void update(MonHoc monHoc) {
        //check exist before
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(monHoc);
        tx.commit();
        System.out.println("update MonHoc Successful");
    }

    public void delete(MonHoc monHoc) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(monHoc);
        tx.commit();
        System.out.println("delete MonHoc Successful");
    }
}
