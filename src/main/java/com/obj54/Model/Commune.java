package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Commune {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Integer idCommune;

    private String nameCommune;

    private Integer zipCode;

    public Integer getId() {
        return idCommune;
    }
    
    public void setId(Integer idCommune) {
        this.idCommune = idCommune;
    }

    public String getnameCommune() {
        return nameCommune;
    }
    
    public void setnameCommune(String nameCommune) {
        this.nameCommune = nameCommune;
    }

    public Integer getzipCode() {
        return zipCode;
    }
    
    public void setzipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
    

}
