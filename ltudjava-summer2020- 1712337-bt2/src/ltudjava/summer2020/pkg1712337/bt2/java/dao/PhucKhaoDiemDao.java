/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltudjava.summer2020.pkg1712337.bt2.java.dao;

import java.util.ArrayList;
import java.util.List;
import ltudjava.summer2020.pkg1712337.bt2.java.pojo.PhucKhaoDiem;
import ltudjava.summer2020.pkg1712337.bt2.java.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class PhucKhaoDiemDao implements Dao<PhucKhaoDiem>{
    @Override
    public void create(PhucKhaoDiem t) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(t);
        session.flush();
        tx.commit();
        System.out.println("Create PhucKhaoDiem Successful");
    }

    @Override
    public List<PhucKhaoDiem> getList() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List data = session.createQuery("FROM PhucKhaoDiem").list();
        List<PhucKhaoDiem> results = new ArrayList<PhucKhaoDiem>();
        for (Object item : data) {
            results.add((PhucKhaoDiem) item);
        }
        tx.commit();
        return results;
    }

    @Override
    public void update(PhucKhaoDiem t) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(t);
        session.flush();
        tx.commit();
        System.out.println("update PhucKhaoDiem Successful");
    }

    @Override
    public void delete(PhucKhaoDiem t) {
        
    }
}
