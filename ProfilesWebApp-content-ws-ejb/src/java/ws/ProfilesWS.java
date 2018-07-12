/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import dto.ProfileDTO;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import remote.IContentService;

/**
 *
 * @author Andrada_Alex
 */
@WebService
@Stateless
public class ProfilesWS {
    
    @EJB
    public IContentService contentService;
    
    @WebMethod
    public ProfileDTO getProfile(@WebParam String name){
        return contentService.getProfile(name);
    }
    
}
