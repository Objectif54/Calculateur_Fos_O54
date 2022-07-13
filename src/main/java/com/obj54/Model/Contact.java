package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idContact;
    private String nomContact;
    private String prenomContact;
    private String numeroContact;
    private String mailContact;
    private String posteContact;
    private Integer contactPrincipale;

    public Integer getIdContact() {
        return idContact;
    }
    
      public void setIdContact(Integer idContact) {
        this.idContact = idContact;
    }

    public String getNomContact() {
        return nomContact;
    }
    
      public void setNomContact(String nomContact) {
        this.nomContact = nomContact;
    }

    public String getPrenomContact() {
        return prenomContact;
    }
    
      public void setPrenomContact(String prenomContact) {
        this.prenomContact = prenomContact;
    }

    public String getNumeroContact() {
        return numeroContact;
    }
    
      public void setNumeroContact(String numeroContact) {
        this.numeroContact = numeroContact;
    }

    public String getMailContact() {
        return mailContact;
    }
    
      public void setMailContact(String mailContact) {
        this.mailContact = mailContact;
    }

    public String getPosteContact() {
        return posteContact;
    }
    
      public void setPosteContact(String posteContact) {
        this.posteContact = posteContact;
    }

    public Integer getContactPrincipale() {
        return contactPrincipale;
    }
    
      public void setContactPrincipale(Integer contactPrincipale) {
        this.contactPrincipale = contactPrincipale;
    }

}
