/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Arun
 */
public class BaseDao {
     private static EntityManagerFactory emf;
    
    public EntityManagerFactory getEntityManagerFactory()
    {
        if(emf==null)
            emf=Persistence.createEntityManagerFactory("BasicSwingPU");
    
        return emf;
    }
    
}
