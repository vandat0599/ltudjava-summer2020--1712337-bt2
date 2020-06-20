package ltudjava.summer2020.pkg1712337.bt2.java.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "Diem")
public class Diem implements Serializable{
    @Column(name = "diemGK")
    private float diemGK;
    @Column(name = "diemCK")
    private float diemCK;
    @Column(name = "diemKhac")
    private float diemKhac;
    @Column(name = "diemTong")
    private float diemTong;
    
    @ManyToOne
    @JoinColumn(name="maMonHoc")
    private MonHoc monHoc;
    
    @Id
    @ManyToOne
    @JoinColumn(name="mssv")
    private SinhVien sinhVien;
    
    public Diem(){}

    public Diem(SinhVien sv, MonHoc monHoc, float diemGK, float diemCK, float diemKhac, float diemTong) {
        this.sinhVien = sv;
        this.monHoc = monHoc;
        this.diemGK = diemGK;
        this.diemCK = diemCK;
        this.diemKhac = diemKhac;
        this.diemTong = diemTong;
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
    
    public SinhVien getSinhVien(){
        return sinhVien;
    }
    
    public MonHoc getMonHoc(){
        return monHoc;
    }
    
    public void setSinhVien(SinhVien sv){
        this.sinhVien = sv;
    }
    
    public void setMonHoc(MonHoc mh){
        this.monHoc = mh;
    }
}
