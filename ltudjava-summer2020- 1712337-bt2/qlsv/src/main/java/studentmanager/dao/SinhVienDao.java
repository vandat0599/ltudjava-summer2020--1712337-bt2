package studentmanager.dao;

import studentmanager.pojo.MonHoc;
import studentmanager.pojo.SinhVien;
import studentmanager.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    public void update(SinhVien sinhVien) {
        //check exist Sinh Vien before
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(sinhVien);
        tx.commit();
        System.out.println("update SinhVien Successful");
    }

    public void delete(SinhVien sinhVien) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(sinhVien);
        tx.commit();
        System.out.println("delete SinhVien Successful");
    }
}
