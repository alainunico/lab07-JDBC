/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dataaccess.RoleDB;
import java.util.List;
import models.Role;

/**
 *
 * @author Alain Unico
 */
public class RoleService {
    
    public List<Role> getAll(int roleID) throws Exception {
        RoleDB userDB = new RoleDB();
        List<Role> users = userDB.getAll(roleID);
        return users;
    }
}
