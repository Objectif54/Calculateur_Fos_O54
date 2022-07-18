package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class CalculFos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id_calcul_fos;
    private String info1;
    private String info2;
    private String info3;
    private String info4;
    private Integer chiffre1;
    private Integer chiffre2;

    public Integer getId() {
        return id_calcul_fos;
    }

    public void setId(Integer id_calcul_fos) {
        this.id_calcul_fos = id_calcul_fos;
    }

    public String getInfoUn() {
        return info1;
    }

    public void setInfoUn(String info1) {
        this.info1 = info1;
    }

    public String getInfoDeux() {
        return info2;
    }

    public void setInfoDeux(String info2) {
        this.info2 = info2;
    }

    public String getInfoTrois() {
        return info3;
    }

    public void setInfoTrois(String info3) {
        this.info3 = info3;
    }

    public String getInfoQuatre() {
        return info4;
    }

    public void setInfoQuatre(String info4) {
        this.info4 = info4;
    }

    public Integer getChiffreUn() {
        return chiffre1;
    }

    public void setChiffreUn(Integer chiffre1) {
        this.chiffre1 = chiffre1;
    }

    public Integer getChiffreDeux() {
        return chiffre2;
    }

    public void setChiffreDeux(Integer chiffre2) {
        this.chiffre2 = chiffre2;
    }
}
