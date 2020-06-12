package com.dat.studentmanager.Dao;

public interface UserDao<T> {
    void dangXuat(T t);
    void dangNhap(T t);
    void doiMatKhau(T t);
}