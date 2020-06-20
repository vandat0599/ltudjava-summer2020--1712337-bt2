package ltudjava.summer2020.pkg1712337.bt2.java.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "MonHoc")
public class MonHoc implements Serializable {
    @Id
    @Column(name = "maMonHoc")
    private String maMonHoc;
    @Column(name = "tenMonHoc")
    private String tenMonHoc;
    @Column(name = "phongHoc")
    private String phongHoc;
    
    @ManyToOne
    @JoinColumn(name="maLopHoc")
    private LopHoc lopHoc;

    public MonHoc(){}

    public MonHoc(String maMonHoc, String tenMonHoc, String phongHoc, LopHoc lopHoc) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.phongHoc = phongHoc;
        this.lopHoc = lopHoc;
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

}
