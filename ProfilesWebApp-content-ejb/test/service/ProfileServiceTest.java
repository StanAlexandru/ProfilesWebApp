/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProfileDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author astan
 */
public class ProfileServiceTest {
    
    private ProfileDao profileDao;        
    private ProfileService profileService;
        
    @Before
    public void setUpClass() {  
        profileDao = new ProfileDao();
        profileService = new ProfileService();
        profileService.setProfileDao(profileDao);
    }
    
    @Test
    public void testGetProfile(){           
        Assert.assertNotNull(profileService.getProfile("jbm"));
    }

}
