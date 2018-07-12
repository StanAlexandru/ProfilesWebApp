/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProfileDao;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;

/**
 *
 * @author Andrada_Alex
 */
@Singleton
@LocalBean
@Startup
public class TestService {
    
    @EJB
    ProfileDao profileDao;

    @PostConstruct
    public void init(){
        System.out.print("profileDao.getProfile(\"Eddy\").getEmail: " + profileDao.getProfile("Eddy").getEmail());
    }
    
}
