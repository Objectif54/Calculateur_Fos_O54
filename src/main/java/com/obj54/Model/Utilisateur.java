package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Utilisateur {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id_utilisateur;
    private String mail_utilisateur;
    private String mdp_utilisateur;
    private String nom_entreprise;
    private String role_utilisateur;

    public Integer getIdUtilisateur() {
        return id_utilisateur;
    }
    
    public void setIdUtilisateur(Integer id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getMailUtilisateur() {
        return mail_utilisateur;
    }
    
    public void setMailUtilisateur(String mail_utilisateur) {
        this.mail_utilisateur = mail_utilisateur;
    }

    public String getMdpUtilisateur() {
        return mdp_utilisateur;
    }
    
    public void setMdpUtilisateur(String mdp_utilisateur) {
        this.mdp_utilisateur = mdp_utilisateur;
    }

    public String getNomEntreprise() {
        return nom_entreprise;
    }
    
    public void setNomEntreprise(String nom_entreprise) {
        this.nom_entreprise = nom_entreprise;
    }

    public String getRoleUtilisateur() {
        return role_utilisateur;
    }
    
    public void setRoleUtilisateur(String role_utilisateur) {
        this.role_utilisateur = role_utilisateur;
    }


}