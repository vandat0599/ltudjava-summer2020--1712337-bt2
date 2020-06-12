package com.dat.studentmanager.Pojo;

class User {
    int id;
    String userName;
    String passWord;
    String permission;

    public User(int id, String userName, String passWord, String permission) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.permission = permission;
    }
}
