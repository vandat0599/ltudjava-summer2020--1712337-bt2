package ltudjava.summer2020.pkg1712337.bt2.java.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
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

    @ManyToOne
    @JoinColumn(name="maLopHoc")
    private LopHoc lopHoc;

    public SinhVien(){}

    public SinhVien(String mssv, String hoTen, String gioiTinh, String cmnd, LopHoc lopHoc) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.lopHoc = lopHoc;
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

    public LopHoc getLopHoc() {
        return lopHoc;
    }

    public void setMaLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }
}
