package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private Integer idSecteurActivite;

    private String nomSecteurActivite;

    public Integer getIdSecteurActivite() {
        return idSecteurActivite;
    }
    
    public void setIdSecteurActivite(Integer idSecteurActivite) {
        this.idSecteurActivite = idSecteurActivite;
    }
    
    public String getNomSecteurActivite() {
        return nomSecteurActivite;
    }
    
    public void setNomSecteurActivite(String nomSecteurActivite) {
        this.nomSecteurActivite = nomSecteurActivite;
    }
    
}
