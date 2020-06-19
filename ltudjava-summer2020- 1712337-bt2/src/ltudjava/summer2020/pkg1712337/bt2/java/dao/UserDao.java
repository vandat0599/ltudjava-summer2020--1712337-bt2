package ltudjava.summer2020.pkg1712337.bt2.java.dao;

public interface UserDao<T> {
    void dangXuat(T t);
    void dangNhap(T t);
    void doiMatKhau(T t);
}