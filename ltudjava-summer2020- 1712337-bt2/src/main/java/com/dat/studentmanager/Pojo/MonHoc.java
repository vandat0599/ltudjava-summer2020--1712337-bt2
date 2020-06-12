package com.dat.studentmanager.Pojo;

import java.util.List;

public class MonHoc {
    String maMonHoc;
    String tenMonHoc;
    String phongHoc;
    List<SinhVien> sinhViens;

    public MonHoc(String maMonHoc, String tenMonHoc, String phongHoc, List<SinhVien> sinhViens) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.phongHoc = phongHoc;
        this.sinhViens = sinhViens;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public List<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(List<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }
}
