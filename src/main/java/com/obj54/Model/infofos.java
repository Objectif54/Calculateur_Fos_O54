package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class infofos {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  private Integer id_info_fos;
  private String reference_fos;
  private String nom_fos;
  private String denomination_fos;
  private String condition_delivrance_certificat_fos;
  private int duree_vie_fos;
  private String date_debut_fos;
  private String datefin_fos;
  private int montant_certificat;
  private int version_fos;

  public Integer getIdInfoFos() {
    return id_info_fos;
  }

  public void setIdInfoFos(Integer id_info_fos) {
    this.id_info_fos = id_info_fos;
  }

  public String getReferenceFos() {
    return reference_fos;
  }

  public void setReferenceFos(String reference_fos) {
    this.reference_fos = reference_fos;
  }

  public String getNomFos() {
    return nom_fos;
  }

  public void setNomFos(String nom_fos) {
    this.nom_fos = nom_fos;
  }

  public String getDenominationFos() {
    return denomination_fos;
  }

  public void setDenominationFos(String denomination_fos) {
    this.denomination_fos = denomination_fos;
  }

  public String getConditionDelivranceCertificatFos() {
    return condition_delivrance_certificat_fos;
  }

  public void setConditionDelivranceCertificatFos(String condition_delivrance_certificat_fos) {
    this.condition_delivrance_certificat_fos = condition_delivrance_certificat_fos;
  }

  public Integer getDuréeVieFos() {
    return duree_vie_fos;
  }

  public void setDuréeVieFos(Integer duree_vie_fos) {
    this.duree_vie_fos = duree_vie_fos;
  }

  public String getDateDebutFos() {
    return date_debut_fos;
  }

  public void setDateDebutFos(String date_debut_fos) {
    this.date_debut_fos = date_debut_fos;
  }

  public String getDateFInFos() {
    return datefin_fos;
  }

  public void setDateFInFos(String datefin_fos) {
    this.datefin_fos = datefin_fos;
  }

  public Integer getMontantCertificat() {
    return montant_certificat;
  }

  public void setMontantCertificat(Integer montant_certificat) {
    this.montant_certificat = montant_certificat;
  }

  public Integer getVersionFos() {
    return version_fos;
  }

  public void setversionFos(Integer version_fos) {
    this.version_fos = version_fos;
  }
}