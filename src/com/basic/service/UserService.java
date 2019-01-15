/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.service;

import com.basic.dao.imp.UserDaoImp;
import com.basic.model.User;
import com.basic.util.Utils;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

/**
 *
 * @author Arun
 */
public class UserService {
     private UserDaoImp userDao= new UserDaoImp();
     
     public boolean saveUser(User user){
         return userDao.addUser(user);
     }
     
     public String getSecurepassword(String password) throws InvalidKeySpecException{
        return Utils.getMD5EncryptedValue(password);
    }
     
     
     public boolean getVerification(String username,String password) throws InvalidKeySpecException{
        List<User> users=userDao.getDBPassword();
        
        for(User user:users){
            if(user.getUsername().equals(username) & user.getPassword().equals(Utils.getMD5EncryptedValue(password))){
                return true;
            }
        }
        return false;
    }
    
}
