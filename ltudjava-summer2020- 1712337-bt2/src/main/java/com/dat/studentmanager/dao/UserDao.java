package com.dat.studentmanager.dao;

public interface UserDao<T> {
    void dangXuat(T t);
    void dangNhap(T t);
    void doiMatKhau(T t);
}