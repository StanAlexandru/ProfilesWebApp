/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.ProfileDB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Andrada_Alex
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class ProfileDao {
    @PersistenceContext
    private EntityManager em;
    
    public ProfileDB getProfile(String name){
        Query query = em.createNamedQuery("ProfileDB.findByName");
        query.setParameter("name", name);
        return (ProfileDB) query.getSingleResult();
    } 
    
}
