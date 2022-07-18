package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_contact;
    private String nom_contact;
    private String prenom_contact;
    private String numero_contact;
    private String mail_contact;
    private String poste_contact;
    private Integer contact_principale;

    public Integer getIdContact() {
        return id_contact;
    }
    
      public void setIdContact(Integer id_contact) {
        this.id_contact = id_contact;
    }

    public String getNomContact() {
        return nom_contact;
    }
    
      public void setNomContact(String nom_contact) {
        this.nom_contact = nom_contact;
    }

    public String getPrenomContact() {
        return prenom_contact;
    }
    
      public void setPrenomContact(String prenom_contact) {
        this.prenom_contact = prenom_contact;
    }

    public String getNumeroContact() {
        return numero_contact;
    }
    
      public void setNumeroContact(String numero_contact) {
        this.numero_contact = numero_contact;
    }

    public String getMailContact() {
        return mail_contact;
    }
    
      public void setMailContact(String mail_contact) {
        this.mail_contact = mail_contact;
    }

    public String getPosteContact() {
        return poste_contact;
    }
    
      public void setPosteContact(String poste_contact) {
        this.poste_contact = poste_contact;
    }

    public Integer getContactPrincipale() {
        return contact_principale;
    }
    
      public void setContactPrincipale(Integer contact_principale) {
        this.contact_principale = contact_principale;
    }

}
