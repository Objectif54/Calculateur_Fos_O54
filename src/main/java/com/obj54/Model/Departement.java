package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Departement {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Integer idDepartement;

    private Integer numDepartement;

    private String nameDepartement;

    public Integer getId() {
        return idDepartement;
    } 

    public void setId(Integer idDepartement) {
        this.idDepartement = idDepartement;
    }

    public Integer getNumDep() {
        return numDepartement;
    } 

    public void setNumDeP(Integer numDepartement) {
        this.numDepartement = numDepartement;
    }

    public String getNameDep() {
        return nameDepartement;
    } 

    public void setNameDeP(String nameDepartement) {
        this.nameDepartement = nameDepartement;
    }




}