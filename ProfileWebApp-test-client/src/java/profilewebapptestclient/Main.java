/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profilewebapptestclient;

import javax.ejb.EJB;
import remote.IContentService;

/**
 *
 * @author Andrada_Alex
 */
public class Main {

    @EJB
    public static IContentService service;
    
    public static void main(String[] args) {
        System.out.println("ProfileWebApp-test-client: " + service.getProfile("Eddy"));
    }
    
}
