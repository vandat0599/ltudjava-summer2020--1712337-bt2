package studentmanager.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "User")
public class User implements Serializable {
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

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public User(String userName, String passWord, String permission) {
        this.userName = userName;
        this.passWord = passWord;
        this.permission = permission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userName.equals(user.userName) &&
                passWord.equals(user.passWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, passWord);
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
