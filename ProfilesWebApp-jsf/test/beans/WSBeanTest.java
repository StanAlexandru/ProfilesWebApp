/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author astan
 */
public class WSBeanTest {

    @Test
    public void testGetProfiles() {
        System.out.println("getProfiles");
        WSBean instance = new WSBean();
        Assert.assertNotNull(instance);
    }
    
}
