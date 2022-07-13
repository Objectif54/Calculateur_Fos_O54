package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class ZoneClimatique {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idZoneClimatique;
    private String nomZoneClimatique;

    public Integer getidZoneClimatique() {
        return idZoneClimatique;
    }
    
    public void setIdSitrChantier(Integer idZoneClimatique) {
        this.idZoneClimatique = idZoneClimatique;
    }

    public String getNomZoneClimatique() {
        return nomZoneClimatique;
    }
    
    public void setNomZoneClimatique(String nomZoneClimatique) {
        this.nomZoneClimatique = nomZoneClimatique;
    }
} 
