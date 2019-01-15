/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.dao.imp;

import com.basic.dao.BaseDao;
import com.basic.dao.UserDao;
import com.basic.model.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Arun
 */
public class UserDaoImp extends BaseDao implements UserDao{
public EntityManagerFactory emf;
    public EntityManager em;
    
    public UserDaoImp() {
        emf = getEntityManagerFactory();
        em = emf.createEntityManager();
    }
    
    @Override
    public boolean addUser(User user) {
        if(user!=null){
            try {
                em.getTransaction().begin();
                em.persist(user);
                em.getTransaction().commit();
                int result=user.getId();
                if(result>0){
                    return true;
                }
            } catch (Exception e) {
            }
        }
        return false;
    }
    
    
  
    public List<User> getDBPassword() {
        List<User> users = em.createQuery("SELECT u FROM User u").getResultList();
        return users;
    }

    @Override
    public boolean getUser(User user) {
        return false;
    }
    
}
