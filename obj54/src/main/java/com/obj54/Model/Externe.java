package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Externe {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idUsers;

    private String ExterneName;

    private String ExterneFirstName;

    private String ExterneMail;

    private String ExternePassWord;
    
    private String ExterneEntreprise;

    public Integer getId() {
        return idUsers;
    }
    
    public void setId(Integer idUsers) {
        this.idUsers = idUsers;
    }
    
    public String getExterneEntreprise() {
        return ExterneEntreprise;
    }
    
    public void setExterneEntreprise(String ExterneEntreprise) {
        this.ExterneEntreprise = ExterneEntreprise;
    }
      
    public String getExterneFirstName() {
        return ExterneFirstName;
    }
    
    public void setExterneFirstName(String ExterneFirstName) {
        this.ExterneFirstName = ExterneFirstName;
    }

    public String getExterneMail() {
        return ExterneMail;
    }
    
    public void setExterneMail(String ExterneMail) {
        this.ExterneMail = ExterneMail;
    }

    public String getExterneName() {
        return ExterneName;
    }
    
    public void setExterneName(String ExterneName) {
        this.ExterneName = ExterneName;
    }

    public String getExternePassWord() {
        return ExternePassWord;
    }
    
    public void setExternePassWord(String ExternePassWord) {
        this.ExternePassWord = ExternePassWord;
    }

   
    
}   
