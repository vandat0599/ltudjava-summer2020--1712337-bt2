package com.dat.studentmanager.dao;

import com.dat.studentmanager.pojo.*;
import com.dat.studentmanager.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class GiaoVuDao implements UserDao<GiaoVu>, Dao<GiaoVu> {

    public void dangXuat(GiaoVu giaoVu) {

    }

    public void dangNhap(GiaoVu giaoVu) {

    }

    public void doiMatKhau(GiaoVu giaoVu) {

    }

    public void importCSVSV(String fileName){

    }

    public void themSV(SinhVien sv){

    }

    public void importCSVTKB(String fileName){

    }

    public void chinhSuaMonHoc(MonHoc mh){

    }

    public void xemDSLop(LopHoc lh){

    }

    public void xemTKB(){

    }

    public void importBangDiem(String fileName){

    }

    public void xemBangDiem(Diem diem){

    }

    public void chinhSuaDiemSV(SinhVien sv){

    }

    public void taoTimePhucKhao(){

    }

    public void xemDanhSachPhucKhao(){

    }

    public void create(GiaoVu value) {
        //check exist before create
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(value);
        tx.commit();
        System.out.println("Create GiaoVu Successful");
    }

    public List<GiaoVu> getList() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List data = session.createQuery("FROM User").list();
        List<GiaoVu> results = new ArrayList<GiaoVu>();
        for (Object item : data) {
            results.add((GiaoVu) item);
        }
        tx.commit();
        return results;
    }

    public void update(GiaoVu value) {
        //check exist before
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(value);
        tx.commit();
        System.out.println("update GiaoVu Successful");
    }

    public void delete(GiaoVu value) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(value);
        tx.commit();
        System.out.println("delete GiaoVu Successful");
    }
}
