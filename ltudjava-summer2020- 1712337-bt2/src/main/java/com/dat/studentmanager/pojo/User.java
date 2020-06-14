package com.dat.studentmanager.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "User")
class User implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "userName")
    private String userName;
    @Column(name = "passWord")
    private String passWord;
    @Column(name = "permission")
    private String permission;

    public User(){}

    public User(int id, String userName, String passWord, String permission) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.permission = permission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
