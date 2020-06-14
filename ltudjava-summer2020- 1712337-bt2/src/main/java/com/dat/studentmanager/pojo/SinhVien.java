package com.dat.studentmanager.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "SinhVien")
public class SinhVien implements Serializable {
    @Id
    @Column(name = "mssv")
    private String mssv;
    @Column(name = "hoTen")
    private String hoTen;
    @Column(name = "gioiTinh")
    private String gioiTinh;
    @Column(name = "cmnd")
    private String cmnd;
    @Column(name = "maLopHoc")
    private String maLopHoc;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="MonHoc_SinhVien", joinColumns={@JoinColumn(referencedColumnName="mssv")}
            , inverseJoinColumns={@JoinColumn(referencedColumnName="maMonHoc")})
    private Set<MonHoc> monHocs;

    public SinhVien(){}

    public SinhVien(String mssv, String hoTen, String gioiTinh, String cmnd, String maLopHoc) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
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

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public Set<MonHoc> getMonHocs() {
        return monHocs;
    }

    public void setMonHocs(Set<MonHoc> monHocs) {
        this.monHocs = monHocs;
    }
}
