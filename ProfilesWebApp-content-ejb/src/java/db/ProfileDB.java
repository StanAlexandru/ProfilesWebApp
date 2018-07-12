/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Andrada_Alex
 */
@Entity
@Table(name = "profiles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProfileDB.findAll", query = "SELECT p FROM ProfileDB p")
    , @NamedQuery(name = "ProfileDB.findById", query = "SELECT p FROM ProfileDB p WHERE p.id = :id")
    , @NamedQuery(name = "ProfileDB.findByName", query = "SELECT p FROM ProfileDB p WHERE p.name = :name")
    , @NamedQuery(name = "ProfileDB.findByEmail", query = "SELECT p FROM ProfileDB p WHERE p.email = :email")
    , @NamedQuery(name = "ProfileDB.findByFacebookAccount", query = "SELECT p FROM ProfileDB p WHERE p.facebookAccount = :facebookAccount")
    , @NamedQuery(name = "ProfileDB.findByLinkedinAccount", query = "SELECT p FROM ProfileDB p WHERE p.linkedinAccount = :linkedinAccount")
    , @NamedQuery(name = "ProfileDB.findByInstagramAccount", query = "SELECT p FROM ProfileDB p WHERE p.instagramAccount = :instagramAccount")})
public class ProfileDB implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 45)
    @Column(name = "facebookAccount")
    private String facebookAccount;
    @Size(max = 45)
    @Column(name = "linkedinAccount")
    private String linkedinAccount;
    @Size(max = 45)
    @Column(name = "instagramAccount")
    private String instagramAccount;
    @Lob
    @Column(name = "photo")
    private byte[] photo;

    public ProfileDB() {
    }

    public ProfileDB(Integer id) {
        this.id = id;
    }

    public ProfileDB(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebookAccount() {
        return facebookAccount;
    }

    public void setFacebookAccount(String facebookAccount) {
        this.facebookAccount = facebookAccount;
    }

    public String getLinkedinAccount() {
        return linkedinAccount;
    }

    public void setLinkedinAccount(String linkedinAccount) {
        this.linkedinAccount = linkedinAccount;
    }

    public String getInstagramAccount() {
        return instagramAccount;
    }

    public void setInstagramAccount(String instagramAccount) {
        this.instagramAccount = instagramAccount;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfileDB)) {
            return false;
        }
        ProfileDB other = (ProfileDB) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.ProfileDB[ id=" + id + " ]";
    }
    
}
