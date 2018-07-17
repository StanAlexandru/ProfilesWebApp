/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.ProfileDB;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author astan
 */
public class ProfileDaoTest {
    
    private static ProfileDao profileDao;
    
    @BeforeClass
    public static void setUpClass() {
        profileDao = new ProfileDao();        
    }
    
    @Test
    public void testGetProfileEddy(){        
        Assert.assertNotNull(profileDao.getProfile("Eddy"));
        Assert.assertEquals("Eddy", profileDao.getProfile("Eddy").getName());
    }
    
    @Test
    public void testGetProfileJBM(){        
        Assert.assertNotNull(profileDao.getProfile("jbm"));
    }
}
