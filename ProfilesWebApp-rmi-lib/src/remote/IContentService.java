/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote;

import dto.ProfileDTO;
import javax.ejb.Remote;

/**
 *
 * @author Andrada_Alex
 */
@Remote
public interface IContentService{
    public ProfileDTO getProfile(String name);
}
