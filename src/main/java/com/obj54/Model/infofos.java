package com.obj54.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class infofos {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  private Integer idInfoFos;
  private String referenceFos;
  private String nomFos;
  private String denominationFos;
  private String conditionDelivranceCertificatFos;
  private int dureeVieFos;
  private String dateDebutFos;
  private String dateFInFos;
  private int montantCertificat;
  private int versionFos;

  public Integer getIdInfoFos() {
    return idInfoFos;
  }

  public void setIdInfoFos(Integer idInfoFos) {
    this.idInfoFos = idInfoFos;
  }

  public String getReferenceFos() {
    return referenceFos;
  }

  public void setReferenceFos(String referenceFos) {
    this.referenceFos = referenceFos;
  }

  public String getNomFos() {
    return nomFos;
  }

  public void setNomFos(String nomFos) {
    this.nomFos = nomFos;
  }

  public String getDenominationFos() {
    return denominationFos;
  }

  public void setDenominationFos(String denominationFos) {
    this.denominationFos = denominationFos;
  }

  public String getConditionDelivranceCertificatFos() {
    return conditionDelivranceCertificatFos;
  }

  public void setConditionDelivranceCertificatFos(String conditionDelivranceCertificatFos) {
    this.conditionDelivranceCertificatFos = conditionDelivranceCertificatFos;
  }

  public Integer getDuréeVieFos() {
    return dureeVieFos;
  }

  public void setDuréeVieFos(Integer dureeVieFos) {
    this.dureeVieFos = dureeVieFos;
  }

  public String getDateDebutFos() {
    return dateDebutFos;
  }

  public void setDateDebutFos(String dateDebutFos) {
    this.dateDebutFos = dateDebutFos;
  }

  public String getDateFInFos() {
    return dateFInFos;
  }

  public void setDateFInFos(String dateFInFos) {
    this.dateFInFos = dateFInFos;
  }

  public Integer getMontantCertificat() {
    return montantCertificat;
  }

  public void setMontantCertificat(Integer montantCertificat) {
    this.montantCertificat = montantCertificat;
  }

  public Integer getVersionFos() {
    return versionFos;
  }

  public void setversionFos(Integer versionFos) {
    this.versionFos = versionFos;
  }
}