package models;

import java.io.Serializable;

public class User implements Serializable {
    private String userEmail;
    private boolean active;
    private String firstname;
    private String lastname;
    private String password;
    private int role;

    public User() {
    }

    public User(String userEmail, boolean active, String firstname, String lastname, String password, int role) {
        this.userEmail = userEmail;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname; 
        this.active = active;
        this.role = role;
    
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
    public boolean isActive(){
        return active;
    }
    
    public void setActive(boolean active){
        this.active = active;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }
  
    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}