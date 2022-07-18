package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private Integer id_secteur_activite;
    private String nom_secteur_activite;

    public Integer getIdSecteurActivite() {
        return id_secteur_activite;
    }
    
    public void setIdSecteurActivite(Integer id_secteur_activite) {
        this.id_secteur_activite = id_secteur_activite;
    }
    
    public String getNomSecteurActivite() {
        return nom_secteur_activite;
    }
    
    public void setNomSecteurActivite(String nom_secteur_activite) {
        this.nom_secteur_activite = nom_secteur_activite;
    }
    
}
