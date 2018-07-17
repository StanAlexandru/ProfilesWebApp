/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dto.ProfileDTO;
import interceptors.LogInterceptor;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import remote.IContentService;

@Interceptors({LogInterceptor.class})
@Stateless
public class ContentService implements IContentService{
    
    @EJB
    private ProfileService profileService;
    
    @PostConstruct
    public void init(){
        System.out.println("ContentService - init");
    }

    public ProfileDTO getProfile(String name) {
        return profileService.getProfile(name);
    }
    
}
