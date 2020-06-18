package studentmanager.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.google.gson.Gson;

import studentmanager.pojo.User;
import studentmanager.util.AppConstants;
import studentmanager.util.FileUtils;
import studentmanager.util.HibernateUtil;

public class AccountDao implements Dao<User>{
    public void create(User value) {
        //check exist before create
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(value);
        tx.commit();
        System.out.println("Create User Successful");
    }

    public List<User> getList() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List data = session.createQuery("FROM User").list();
        List<User> results = new ArrayList<User>();
        for (Object item : data) {
            results.add((User) item);
        }
        tx.commit();
        return results;
    }

    public void update(User value) {
        //check exist before
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(value);
        tx.commit();
        System.out.println("update User Successful");
    }

    public void delete(User value) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(value);
        tx.commit();
        System.out.println("delete User Successful");
    }

    public boolean isExistAccount(String userName, String passWord){
        return getList().contains(new User(userName, passWord));
    }
    
    public User getUserByUserName(String userName) {
    	List<User> users = getList();
    	for (int i =0;i<users.size();i++) {
    		if (users.get(i).getUserName().equals(userName)) {
    			return users.get(i);
    		}
    	}
    	return null;
    }
    
    public void saveUserToLocal(User user) {
    	FileUtils.saveObject(user, "user.txt");
    	
    }
    
    public User getUserFromLocal() {
    	return FileUtils.getObject(User.class, "user.txt");
    }
    
}
