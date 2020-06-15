package com.dat.studentmanager.dao;

import java.util.List;

public interface Dao<T> {
    void create(T t);
    List<T> getList();
    void update(T t);
    void delete(T t);
}
