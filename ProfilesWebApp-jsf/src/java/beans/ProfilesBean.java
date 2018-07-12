/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import model.Profile;

/**
 *
 * @author Andrada_Alex
 */
@ManagedBean
@RequestScoped
public class ProfilesBean implements Serializable{
    
    @ManagedProperty("#{wSBean}")
    WSBean wsBean;

    public WSBean getWsBean() {
        return wsBean;
    }

    public void setWsBean(WSBean wsBean) {
        this.wsBean = wsBean;
    }
    
    private List<Profile> profilesList;

    public List<Profile> getProfilesList() {
        return profilesList;
    }

    public void setProfilesList(List<Profile> profilesList) {
        this.profilesList = profilesList;
    }
    
    
    @PostConstruct
    public void init(){        
        profilesList = wsBean.getProfiles(new String[] {"Eddy", "jbm"});
    }
    
}
