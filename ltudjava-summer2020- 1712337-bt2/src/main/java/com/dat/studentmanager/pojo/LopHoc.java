package com.dat.studentmanager.pojo;

import java.util.List;

public class LopHoc {
    String maLopHoc;
    List<SinhVien> sinhViens;

    public LopHoc(String maLopHoc, List<SinhVien> sinhViens) {
        this.maLopHoc = maLopHoc;
        this.sinhViens = sinhViens;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public List<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(List<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }
}
