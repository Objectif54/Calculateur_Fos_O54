package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class SiteChantier {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id_site_chantier;
    private String nom_chantier;
    private String date_debut_chantier;
    private String date_fin_chantier;
    private Integer prime_percu_par_beneficaire;
    private Integer equipement_deja_beneficie_prime_cee;

    public Integer getIdSitrChantier() {
        return id_site_chantier;
    }
    
    public void setIdSitrChantier(Integer id_site_chantier) {
        this.id_site_chantier = id_site_chantier;
    }

    public String getNomChantier() {
        return nom_chantier;
    }
    
    public void setNomChantier(String nom_chantier) {
        this.nom_chantier = nom_chantier;
    }

    public String getDateDebutChantier() {
        return date_debut_chantier;
    }
    
    public void setDateDebutChantier(String date_debut_chantier) {
        this.date_debut_chantier = date_debut_chantier;
    } 

    public String getDateFinChantier() {
        return date_fin_chantier;
    }
    
    public void setDateFinChantier(String date_fin_chantier) {
        this.date_fin_chantier = date_fin_chantier;
    } 

    public Integer getPrimePerçuParBeneficaire() {
        return prime_percu_par_beneficaire;
    }
    
    public void setPrimePerçuParBeneficaire(Integer prime_percu_par_beneficaire) {
        this.prime_percu_par_beneficaire = prime_percu_par_beneficaire;
    }

    public Integer getEquipementDejaBeneficiePrimeCee() {
        return equipement_deja_beneficie_prime_cee;
    }
    
    public void setEquipementDejaBeneficiePrimeCee(Integer equipement_deja_beneficie_prime_cee) {
        this.equipement_deja_beneficie_prime_cee = equipement_deja_beneficie_prime_cee;
    }
}
