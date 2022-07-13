package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Utilisateur {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idUtilisateur;
    private String mailUtilisateur;
    private String mdpUtilisateur;
    private String nomEntreprise;
    private String roleUtilisateur;

    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }
    
    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getMailUtilisateur() {
        return mailUtilisateur;
    }
    
    public void setMailUtilisateur(String mailUtilisateur) {
        this.mailUtilisateur = mailUtilisateur;
    }

    public String getMdpUtilisateur() {
        return mdpUtilisateur;
    }
    
    public void setMdpUtilisateur(String mdpUtilisateur) {
        this.mdpUtilisateur = mdpUtilisateur;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }
    
    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getRoleUtilisateur() {
        return roleUtilisateur;
    }
    
    public void setRoleUtilisateur(String roleUtilisateur) {
        this.roleUtilisateur = roleUtilisateur;
    }


}
