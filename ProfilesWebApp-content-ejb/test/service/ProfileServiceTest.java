/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProfileDao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

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
