/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.dao.imp;

import com.basic.dao.BaseDao;
import com.basic.dao.ParsonDao;
import com.basic.model.Parson;
import java.util.List;
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
    
    
    public List<Parson> getAllPerson(){
         List<Parson> parsons = em.createNamedQuery("Parson.findAll").getResultList();
         return parsons;
    }
    
    public boolean addParson(Parson parson){
        if(parson!=null){
            try {
                em.getTransaction().begin();
                em.persist(parson);
                em.getTransaction().commit();
                int result=parson.getId();
                if(result>0){
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    
    }
    
    
    
}
