package services;

import dataaccess.UserDB;
import java.util.List;
import models.User;

public class UserService {
    public User get(int role) throws Exception {
        UserDB userDB = new UserDB();
        User user = userDB.get(role);
        return user;
    }
    
    public List<User> getAll(String userEmail) throws Exception {
        UserDB userDB = new UserDB();
        List<User> users = userDB.getAll(userEmail);
        return users;
    }
    
    public void insert(String firstname, String lastname, int role) throws Exception {
        User user = new User(0, firstname, lastname, role);
        UserDB userDB = new UserDB();
        userDB.insert(user);
    }
    
    public void update(String firstname, String lastname, String password, int role) throws Exception {
        User user = new User(firstname, lastname, password, role);
        UserDB userDB = new UserDB();
        userDB.update(user);
    }
    
    public void delete(int role) throws Exception {
        User user = new User();
        user.setRole(role);
        UserDB userDB = new UserDB();
        userDB.delete(user);
    }
}
