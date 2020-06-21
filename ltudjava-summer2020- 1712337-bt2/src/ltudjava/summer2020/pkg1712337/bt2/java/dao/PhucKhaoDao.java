/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltudjava.summer2020.pkg1712337.bt2.java.dao;

import java.util.ArrayList;
import java.util.List;
import ltudjava.summer2020.pkg1712337.bt2.java.pojo.MonHoc;
import ltudjava.summer2020.pkg1712337.bt2.java.pojo.PhucKhao;
import ltudjava.summer2020.pkg1712337.bt2.java.pojo.SinhVien;
import ltudjava.summer2020.pkg1712337.bt2.java.pojo.User;
import ltudjava.summer2020.pkg1712337.bt2.java.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author user
 */
public class PhucKhaoDao implements Dao<PhucKhao>{

    @Override
    public void create(PhucKhao t) {
        if (t.getMaMonHoc().equals("All")){
            MonHocDao monHocDao = new MonHocDao();
            List<MonHoc> monHocs = monHocDao.getList();
            for (int i=0;i<monHocs.size();i++){
                createPK(new PhucKhao(monHocs.get(i).getMaMonHoc(), t.getNgayBatDau(), t.getNgayKetThuc()));
            }
        }else{
            createPK(t);
        }
    }
    
    private void createPK(PhucKhao t){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(t);
        session.flush();
        tx.commit();
        System.out.println("Create PhucKhao: " + t.getMaMonHoc() +" Successful");
    }

    @Override
    public List<PhucKhao> getList() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List data = session.createQuery("FROM PhucKhao").list();
        List<PhucKhao> results = new ArrayList<PhucKhao>();
        for (Object item : data) {
            results.add((PhucKhao) item);
        }
        tx.commit();
        return results;
    }

    @Override
    public void update(PhucKhao t) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(t);
        session.flush();
        tx.commit();
        System.out.println("update PhucKhao Successful");
    }

    @Override
    public void delete(PhucKhao t) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createSQLQuery("delete from PhucKhao where maMonHoc = \"" + t.getMaMonHoc()+ "\"");
        query.executeUpdate();
        tx.commit();
        System.out.println("delete PhucKhao Successful");
    }

}
