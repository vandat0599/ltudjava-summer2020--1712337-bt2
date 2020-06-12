package com.dat.studentmanager.Pojo;

import java.util.List;

public class SinhVien extends User {
    String mssv;
    String hoTen;
    String gioiTinh;
    String cmnd;
    List<MonHoc> monHocs;
    String maLopHoc;

    public SinhVien(int id, String userName, String passWord, String permission, String mssv, String hoTen, String gioiTinh, String cmnd, List<MonHoc> monHocs, String maLopHoc) {
        super(id, userName, passWord, permission);
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.monHocs = monHocs;
        this.maLopHoc = maLopHoc;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public List<MonHoc> getMonHocs() {
        return monHocs;
    }

    public void setMonHocs(List<MonHoc> monHocs) {
        this.monHocs = monHocs;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }
}
