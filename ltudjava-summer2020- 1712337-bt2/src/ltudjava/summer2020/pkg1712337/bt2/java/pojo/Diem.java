package ltudjava.summer2020.pkg1712337.bt2.java.pojo;

import javax.persistence.*;

@Entity
@Table(name = "Diem")
public class Diem {
    @Id
    @Column(name = "mssv")
    private String mssv;
    @Column(name = "maMonHoc")
    private String maMonHoc;
    @Column(name = "diemGK")
    private float diemGK;
    @Column(name = "diemCK")
    private float diemCK;
    @Column(name = "diemKhac")
    private float diemKhac;
    @Column(name = "diemTong")
    private float diemTong;

    public Diem(){}

    public Diem(String mssv, String maMonHoc, float diemGK, float diemCK, float diemKhac, float diemTong) {
        this.mssv = mssv;
        this.maMonHoc = maMonHoc;
        this.diemGK = diemGK;
        this.diemCK = diemCK;
        this.diemKhac = diemKhac;
        this.diemTong = diemTong;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public float getDiemGK() {
        return diemGK;
    }

    public void setDiemGK(float diemGK) {
        this.diemGK = diemGK;
    }

    public float getDiemCK() {
        return diemCK;
    }

    public void setDiemCK(float diemCK) {
        this.diemCK = diemCK;
    }

    public float getDiemKhac() {
        return diemKhac;
    }

    public void setDiemKhac(float diemKhac) {
        this.diemKhac = diemKhac;
    }

    public float getDiemTong() {
        return diemTong;
    }

    public void setDiemTong(float diemTong) {
        this.diemTong = diemTong;
    }
}
