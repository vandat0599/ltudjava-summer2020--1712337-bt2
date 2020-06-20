package ltudjava.summer2020.pkg1712337.bt2.java.dao;

import ltudjava.summer2020.pkg1712337.bt2.java.pojo.MonHoc;
import ltudjava.summer2020.pkg1712337.bt2.java.pojo.SinhVien;
import ltudjava.summer2020.pkg1712337.bt2.java.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ltudjava.summer2020.pkg1712337.bt2.java.pojo.User;
import org.hibernate.query.Query;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.transform.Transformers;

public class SinhVienDao implements UserDao<SinhVien>, Dao<SinhVien> {

    public void dangXuat(SinhVien sinhVien) {

    }

    public void dangNhap(SinhVien sinhVien) {

    }

    public void doiMatKhau(SinhVien sinhVien) {

    }

    public void xemDiem(){

    }

    public void phucKhao(){

    }

    public void create(SinhVien sinhVien) {
        //check lophoc exist before create SV
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(sinhVien);
        session.save(new User(sinhVien.getMssv(), sinhVien.getMssv()));
        session.flush();
        tx.commit();
        System.out.println("Create SinhVien Successful");
    }

    public List<SinhVien> getList() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List data = session.createQuery("FROM SinhVien").list();
        List<SinhVien> results = new ArrayList<SinhVien>();
        for (Object item : data) {
            results.add((SinhVien) item);
        }
        tx.commit();
        return results;
    }
    
    public SinhVien getSinhVienByMSSV(String mssv) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List data = session.createQuery("FROM SinhVien where mssv = :mssv")
                .setParameter("mssv", mssv)
                .list();
        List<SinhVien> results = new ArrayList<SinhVien>();
        for (Object item : data) {
            results.add((SinhVien) item);
        }
        tx.commit();
        return results.get(0);
    }
    
    public List<SinhVien> getSinhVienByMaLopMaMon(String maLop, String maMon){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        String query = "from SinhVien";
        List data = session.createQuery(query).list();
        if (!maLop.equals("All")){
            if (maMon.equals("All")){
                query = "from SinhVien where lopHoc.maLopHoc = :maLop";
                data = session.createQuery(query).
                        setParameter("maLop", maLop).
                        list();
            }else{
                query = "select s from SinhVien s, MonHoc m where s.lopHoc.maLopHoc = m.lopHoc.maLopHoc and s.lopHoc.maLopHoc = :maLop and m.maMonHoc = :maMon";
                data = session.createQuery(query).
                    setParameter("maLop", maLop).
                    setParameter("maMon", maMon).
                    list();
            }
        }else{
            if (maMon.equals("All")){
                query = "from SinhVien";
                data = session.createQuery(query).
                        list();
            }else{
                query = "select s from SinhVien s, MonHoc m where s.lopHoc.maLopHoc = m.lopHoc.maLopHoc and m.maMonHoc = :maMon";
                data = session.createQuery(query).
                    setParameter("maMon", maMon).
                    list();
            }
        }
        
        List<SinhVien> results = new ArrayList<SinhVien>();
        for (Object item : data) {
            results.add((SinhVien)item);
        }
        tx.commit();
        return results;
    }

    public void update(SinhVien sinhVien) {
        //check exist Sinh Vien before
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(sinhVien);
        session.flush();
        tx.commit();
        System.out.println("update SinhVien Successful");
    }

    public void delete(SinhVien sinhVien) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createSQLQuery("delete from SinhVien where mssv = \"" + sinhVien.getMssv() + "\"");
        query.executeUpdate();
        tx.commit();
        System.out.println("delete SinhVien Successful");
    }
}
