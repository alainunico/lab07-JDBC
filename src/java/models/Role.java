/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


import java.io.Serializable;
/**
 *
 * @author Alain Unico
 */
public class Role implements Serializable {
    public int roleID;
    public String roleName;
    
    public Role() {
    }
    
    public Role(int roleID, String roleName) {
        this.roleID = roleID;
        this.roleName = roleName;
    }
    
    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }
    
    public String getRoleName(){
        return roleName;
    }
    
    public void getRoleName(String roleName){
        this.roleName = roleName;
    }
    
}
