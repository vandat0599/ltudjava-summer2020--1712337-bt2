/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltudjava.summer2020.pkg1712337.bt2.java.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "PhucKhaoDiem")
public class PhucKhaoDiem {
    @Id
    @Column(name = "mssv")
    String mssv;
    
    @Column(name = "hoTen")
    String hoTen;
    
    @ManyToOne
    @JoinColumn(name="maMonHoc")
    PhucKhao bangPhucKhao;
    
    @Column(name = "cotDiem")
    String cotDiem;
    
    @Column(name = "diemMongMuon")
    float diemMongMuon;
    
    @Column(name = "lyDo")
    String lyDo;

    public PhucKhaoDiem(){}

    public PhucKhaoDiem(String mssv, String hoTen, PhucKhao bangPhucKhao, String cotDiem, float diemMongMuon, String lyDo) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.bangPhucKhao = bangPhucKhao;
        this.cotDiem = cotDiem;
        this.diemMongMuon = diemMongMuon;
        this.lyDo = lyDo;
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

    public PhucKhao getBangPhucKhao() {
        return bangPhucKhao;
    }

    public void setBangPhucKhao(PhucKhao bangPhucKhao) {
        this.bangPhucKhao = bangPhucKhao;
    }

    public String getCotDiem() {
        return cotDiem;
    }

    public void setCotDiem(String cotDiem) {
        this.cotDiem = cotDiem;
    }

    public float getDiemMongMuon() {
        return diemMongMuon;
    }

    public void setDiemMongMuon(float diemMongMuon) {
        this.diemMongMuon = diemMongMuon;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }
    
    
    
}
