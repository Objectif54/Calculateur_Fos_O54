package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class SousSecteur {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private Integer idsousSecteur;

    private String nameSousSecteur;

    public Integer getIdSousSecteur() {
        return idsousSecteur;
    }
    
    public void setIdSousSecteur(Integer idsousSecteur) {
        this.idsousSecteur = idsousSecteur;
    }
    
    public String getnameSousSecteur() {
        return nameSousSecteur;
    }
    
    public void setnameSousSecteur(String nameSousSecteur) {
        this.nameSousSecteur = nameSousSecteur;
    }
    
}
