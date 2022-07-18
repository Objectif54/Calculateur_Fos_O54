package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Adresse {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    
    private Integer id_adresse;
    private String nom_commune;
    private Integer code_postale;
    private String nom_departement;
    private String numero_departement;
    private String nom_adresse;
    private String complement_adresse;

    public Integer getId() {
        return id_adresse;
    }
    
    public void setId(Integer id_adresse) {
        this.id_adresse = id_adresse;
    }

    public String getNomCommune() {
        return nom_commune;
    }
    
    public void setNomCommune(String nom_commune) {
        this.nom_commune = nom_commune;
    }

    public Integer getcodePostale() {
        return code_postale;
    }
    
    public void setcodePostale(Integer code_postale) {
        this.code_postale = code_postale;
    }
    
    public String getNomDepartement() {
        return nom_departement;
    }
    
    public void setNomDepartement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    public String getNumeroDepartement() {
        return numero_departement;
    }
    
    public void setNumeroDepartement(String numero_departement) {
        this.numero_departement = numero_departement;
    }

    public String getnomAdresse() {
        return nom_adresse;
    }
    
    public void setnomAdresse(String nom_adresse) {
        this.nom_adresse = nom_adresse;
    }

    public String getComplementAdresse() {
        return complement_adresse;
    }
    
    public void setComplementAdresse(String complement_adresse) {
        this.complement_adresse = complement_adresse;
    }
}
