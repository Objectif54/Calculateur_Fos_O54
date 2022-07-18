package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class SecteurApplication {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id_secteur_application;
    private String nom_secteur_application;
    private String type_de_travaux;

    public Integer getId() {
        return id_secteur_application;
    }
    
    public void setId(Integer id_secteur_application) {
        this.id_secteur_application = id_secteur_application;
    }
    
    public String getNomSecteurApplication() {
        return nom_secteur_application;
    }
    
    public void setNomSecteurApplication(String nom_secteur_application) {
        this.nom_secteur_application = nom_secteur_application;
    } 
    
    public String getTypeDeTravaux() {
        return type_de_travaux;
    }
    
    public void setTypeDeTravaux(String type_de_travaux) {
        this.type_de_travaux = type_de_travaux;
    } 
}   
