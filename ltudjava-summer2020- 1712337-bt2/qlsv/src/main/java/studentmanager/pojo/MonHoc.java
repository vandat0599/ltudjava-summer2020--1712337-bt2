package studentmanager.pojo;

import javax.persistence.*;
import java.io.Serializable;
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
    @ManyToMany(mappedBy = "monHocs")
    private Set<SinhVien> sinhViens;

    public MonHoc(){}

    public MonHoc(String maMonHoc, String tenMonHoc, String phongHoc) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.phongHoc = phongHoc;
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

    public Set<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(Set<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }
}
