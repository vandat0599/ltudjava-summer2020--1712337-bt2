package ltudjava.summer2020.pkg1712337.bt2.java.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "LopHoc")
public class LopHoc implements Serializable {
    @Id
    @Column(name = "maLopHoc")
    private String maLopHoc;

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
}
