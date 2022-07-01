package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class

public class Contact {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idContact;

    private String nameContact;

    private String lastNameContact;

    private String numContact;

    private String mailContact;

    public Integer getId() {
        return idContact;
    }
    
    public void setId(Integer idContact) {
        this.idContact = idContact;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public String getLastNameContact() {
        return lastNameContact;
    }

    public void setLastNameContact(String lastNameContact) {
        this.lastNameContact = lastNameContact;
    }

    public String getNumContact() {
        return numContact;
    }

    public void setNumContact(String numContact) {
        this.numContact = numContact;
    }

    public String getMailContact() {
        return mailContact;
    }

    public void setMailContact(String mailContact) {
        this.mailContact = mailContact;
    }

}
