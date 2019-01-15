/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.dao.imp;

import com.basic.dao.BaseDao;
import com.basic.dao.ParsonDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Arun
 */
public class ParsonDaoImp extends BaseDao implements ParsonDao{
    
    public EntityManagerFactory emf;
    public EntityManager em;
    
    public ParsonDaoImp() {
        emf = getEntityManagerFactory();
        em = emf.createEntityManager();
    }
    
    
    
}
