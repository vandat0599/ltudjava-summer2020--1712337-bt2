package com.dat.studentmanager.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "LopHoc")
public class LopHoc implements Serializable {
    @Id
    @Column(name = "maLopHoc")
    private String maLopHoc;

    @OneToMany(mappedBy = "lopHoc")
    private Set<SinhVien> sinhViens;

    public LopHoc(){}

    public LopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
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
