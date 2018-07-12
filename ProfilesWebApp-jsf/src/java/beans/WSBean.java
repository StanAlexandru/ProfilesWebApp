/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import model.Profile;
import ws.ProfileDTO;
import ws.ProfilesWS;
import ws.ProfilesWSService;

/**
 *
 * @author Andrada_Alex
 */
@ManagedBean
@ApplicationScoped
public class WSBean implements Serializable{
    
    
        
    public List<Profile> getProfiles(String [] names){
        
        List<Profile> profiles = new ArrayList<>();
        
        for(String name: names){
            ProfilesWSService profilesWSService = new ProfilesWSService();
            ProfilesWS profilesWSPort = profilesWSService.getProfilesWSPort();

            ProfileDTO profileDTO = profilesWSPort.getProfile(name);
            
            Profile profile = new Profile();
            profile.setName(profileDTO.getName());
            profile.setEmail(profileDTO.getEmail());
            profile.setFacebookAccount(profileDTO.getFacebookAccount());
            profile.setInstagramAccount(profileDTO.getInstagramAccount());
            profile.setLinkedinAccount(profileDTO.getLinkedinAccount());
            profile.setPhoto(profileDTO.getPhoto());
            profile.setId(profileDTO.getId());
            
            profiles.add(profile);
        }
        
        return profiles;
    }
    
}
