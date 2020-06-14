package com.dat.studentmanager.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Table(name = "LopHoc")
public class LopHoc implements Serializable {
    @Id
    @Column(name = "maLopHoc")
    private String maLopHoc;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="mssv")
    private Set<SinhVien> sinhViens;

    public LopHoc(String maLopHoc, Set<SinhVien> sinhViens) {
        this.maLopHoc = maLopHoc;
        this.sinhViens = sinhViens;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public Set<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(Set<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }
}
