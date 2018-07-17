/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;
import suite.ContentTestSuite;

/**
 *
 * @author astan
 */
public class ContentTestRunner {
    
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ContentTestSuite.class);

        for (Failure failure : result.getFailures()) {
           System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
   }
}
