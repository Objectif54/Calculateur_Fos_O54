package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class SiteChantier {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idSitrChantier;
    private String nomChantier;
    private String dateDebutChantier;
    private String dateFinChantier;
    private Integer primePercuParBeneficaire;
    private Integer equipementDejaBeneficiePrimeCee;

    public Integer getIdSitrChantier() {
        return idSitrChantier;
    }
    
    public void setIdSitrChantier(Integer idSitrChantier) {
        this.idSitrChantier = idSitrChantier;
    }

    public String getNomChantier() {
        return nomChantier;
    }
    
    public void setNomChantier(String nomChantier) {
        this.nomChantier = nomChantier;
    }

    public String getDateDebutChantier() {
        return dateDebutChantier;
    }
    
    public void setDateDebutChantier(String dateDebutChantier) {
        this.dateDebutChantier = dateDebutChantier;
    } 

    public String getDateFinChantier() {
        return dateFinChantier;
    }
    
    public void setDateFinChantier(String dateFinChantier) {
        this.dateFinChantier = dateFinChantier;
    } 

    public Integer getPrimePerçuParBeneficaire() {
        return primePercuParBeneficaire;
    }
    
    public void setPrimePerçuParBeneficaire(Integer primePercuParBeneficaire) {
        this.primePercuParBeneficaire = primePercuParBeneficaire;
    }

    public Integer getEquipementDejaBeneficiePrimeCee() {
        return equipementDejaBeneficiePrimeCee;
    }
    
    public void setEquipementDejaBeneficiePrimeCee(Integer equipementDejaBeneficiePrimeCee) {
        this.equipementDejaBeneficiePrimeCee = equipementDejaBeneficiePrimeCee;
    }
}
