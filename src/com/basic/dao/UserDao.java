/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.dao;

import com.basic.model.User;

/**
 *
 * @author Arun
 */
public interface UserDao {
    public boolean addUser(User user);
    public boolean getUser(User user);
}
