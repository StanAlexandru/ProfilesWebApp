/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suite;

import dao.ProfileDaoTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import service.ProfileServiceTest;

/**
 *
 * @author astan
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    ProfileDaoTest.class,
    ProfileServiceTest.class
})
public class ContentTestSuite {    
}
