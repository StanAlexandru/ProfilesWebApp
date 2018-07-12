/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProfileDao;
import db.ProfileDB;
import dto.ProfileDTO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Andrada_Alex
 */
@Stateless
public class ProfileService {
    
    @EJB
    ProfileDao profileDao;

    public ProfileDTO getProfile(String name) {
        
        ProfileDB profileDB = profileDao.getProfile(name);
        ProfileDTO profileDTO = null;
        
        if(profileDB != null){
            profileDTO = new ProfileDTO();;
            profileDTO.setName(profileDB.getName());
            profileDTO.setEmail(profileDB.getEmail());
            profileDTO.setId(profileDB.getId());
            profileDTO.setPhoto(profileDB.getPhoto());
            profileDTO.setFacebookAccount(profileDB.getFacebookAccount());
            profileDTO.setInstagramAccount(profileDB.getInstagramAccount());
            profileDTO.setLinkedinAccount(profileDB.getLinkedinAccount());
        }
        
        return profileDTO;
    }
    
}
