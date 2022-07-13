package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class SecteurApplication {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idSecteurApplication;
    private String nomSecteurApplication;
    private String typeDeTravaux;

    public Integer getId() {
        return idSecteurApplication;
    }
    
    public void setId(Integer idSecteurApplication) {
        this.idSecteurApplication = idSecteurApplication;
    }
    
    public String getNomSecteurApplication() {
        return nomSecteurApplication;
    }
    
    public void setNomSecteurApplication(String nomSecteurApplication) {
        this.nomSecteurApplication = nomSecteurApplication;
    } 
    
    public String getTypeDeTravaux() {
        return typeDeTravaux;
    }
    
    public void setTypeDeTravaux(String typeDeTravaux) {
        this.typeDeTravaux = typeDeTravaux;
    } 
}   
