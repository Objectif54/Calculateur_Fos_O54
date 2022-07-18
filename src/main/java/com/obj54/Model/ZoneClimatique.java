package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class ZoneClimatique {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id_zone_climatique;
    private String nom_zone_climatique;

    public Integer getidZoneClimatique() {
        return id_zone_climatique;
    }
    
    public void setIdSitrChantier(Integer id_zone_climatique) {
        this.id_zone_climatique = id_zone_climatique;
    }

    public String getNomZoneClimatique() {
        return nom_zone_climatique;
    }
    
    public void setNomZoneClimatique(String nom_zone_climatique) {
        this.nom_zone_climatique = nom_zone_climatique;
    }
} 
