package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Adresse {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    
    private Integer idAdresse;
    private String nomCommune;
    private Integer codePostale;
    private String nomDepartement;
    private String numeroDepartement;
    private String nomAdresse;
    private String complementAdresse;

    public Integer getId() {
        return idAdresse;
    }
    
    public void setId(Integer idAdresse) {
        this.idAdresse = idAdresse;
    }

    public String getNomCommune() {
        return nomCommune;
    }
    
    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    public Integer getcodePostale() {
        return codePostale;
    }
    
    public void setcodePostale(Integer codePostale) {
        this.codePostale = codePostale;
    }
    
    public String getNomDepartement() {
        return nomDepartement;
    }
    
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public String getNumeroDepartement() {
        return numeroDepartement;
    }
    
    public void setNumeroDepartement(String numeroDepartement) {
        this.numeroDepartement = numeroDepartement;
    }

    public String getnomAdresse() {
        return nomAdresse;
    }
    
    public void setnomAdresse(String nomAdresse) {
        this.nomAdresse = nomAdresse;
    }

    public String getComplementAdresse() {
        return complementAdresse;
    }
    
    public void setComplementAdresse(String complementAdresse) {
        this.complementAdresse = complementAdresse;
    }
}
