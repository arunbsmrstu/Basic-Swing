/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.service;

import com.basic.dao.imp.ParsonDaoImp;
import com.basic.model.Parson;
import java.util.List;

/**
 *
 * @author Arun
 */
public class ParsonService {
    
    private ParsonDaoImp parsonDaoImp = new ParsonDaoImp();
    public List<Parson> getParson(){
        return parsonDaoImp.getAllPerson();
    }
    
    public boolean saveParson(Parson parson){
        return parsonDaoImp.addParson(parson);
    }
    
}
