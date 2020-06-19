package ltudjava.summer2020.pkg1712337.bt2.java.dao;

import ltudjava.summer2020.pkg1712337.bt2.java.pojo.LopHoc;
import ltudjava.summer2020.pkg1712337.bt2.java.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import ltudjava.summer2020.pkg1712337.bt2.java.pojo.MonHoc;

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
    
    public List<MonHoc> getMonHocByMaLop(String maLop){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        String query = "From LopHoc";
        if (!maLop.equals("All")){
            query = "select * from LopHoc where maLopHoc = \"" + maLop + "\"";
        }
        List data = session.createQuery(query).list();
        List<MonHoc> results = new ArrayList<MonHoc>();
        for (Object item : data) {
            LopHoc m = (LopHoc) item;
            System.out.println("Mon hoc size: " + m.getMonHocs().size());
            Set<MonHoc> monhocs = m.getMonHocs();
            for (Object mh: monhocs){
                results.add((MonHoc)mh);
            }
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
