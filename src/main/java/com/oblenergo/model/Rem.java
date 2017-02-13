package com.oblenergo.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by us9522 on 27.01.2017.
 */
@Entity
@Table(name = "rem")
public class Rem implements Serializable{

  private int id;
  private String rem_name;
  private String director;
  private String contacts;
  private String rek_bank;
  private String rem_licality;
  private String director_rod;
  private String director_dav;
  private String dovirenist;
  private String golovnyi_ingener;
  private String vykonavets;
  private String region;
  private String rek_bank_with_spec;
  private String rek_bank_without_spec;
  private String city_town_village;

  @Id
  @Column(name = "id")
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Column(name = "rem_name")
  public String getRem_name() {
    return rem_name;
  }

  public void setRem_name(String rem_name) {
    this.rem_name = rem_name;
  }

  @Column(name = "director")
  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  @Column(name = "contacts")
  public String getContacts() {
    return contacts;
  }

  public void setContacts(String contacts) {
    this.contacts = contacts;
  }

  @Column(name = "rek_bank")
  public String getRek_bank() {
    return rek_bank;
  }

  public void setRek_bank(String rek_bank) {
    this.rek_bank = rek_bank;
  }

  @Column(name = "rem_licality")
  public String getRem_licality() {
    return rem_licality;
  }

  public void setRem_licality(String rem_licality) {
    this.rem_licality = rem_licality;
  }

  @Column(name = "director_rod")
  public String getDirector_rod() {
    return director_rod;
  }

  public void setDirector_rod(String director_rod) {
    this.director_rod = director_rod;
  }

  @Column(name = "director_dav")
  public String getDirector_dav() {
    return director_dav;
  }

  public void setDirector_dav(String director_dav) {
    this.director_dav = director_dav;
  }

  @Column(name = "dovirenist")
  public String getDovirenist() {
    return dovirenist;
  }

  public void setDovirenist(String dovirenist) {
    this.dovirenist = dovirenist;
  }

  @Column(name = "golovnyi_ingener")
  public String getGolovnyi_ingener() {
    return golovnyi_ingener;
  }

  public void setGolovnyi_ingener(String golovnyi_ingener) {
    this.golovnyi_ingener = golovnyi_ingener;
  }

  @Column(name = "vykonavets")
  public String getVykonavets() {
    return vykonavets;
  }

  public void setVykonavets(String vykonavets) {
    this.vykonavets = vykonavets;
  }

  @Column(name = "region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  @Column(name = "rek_bank_with_spec")
  public String getRek_bank_with_spec() {
    return rek_bank_with_spec;
  }

  public void setRek_bank_with_spec(String rek_bank_with_spec) {
    this.rek_bank_with_spec = rek_bank_with_spec;
  }

  @Column(name = "rek_bank_without_spec")
  public String getRek_bank_without_spec() {
    return rek_bank_without_spec;
  }

  public void setRek_bank_without_spec(String rek_bank_without_spec) {
    this.rek_bank_without_spec = rek_bank_without_spec;
  }

  @Column(name = "city_town_village")
  public String getCity_town_village() {
    return city_town_village;
  }

  public void setCity_town_village(String city_town_village) {
    this.city_town_village = city_town_village;
  }




  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this, true);
  }

  @Override
  public boolean equals(Object obj) {
    return EqualsBuilder.reflectionEquals(this, obj, true);
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
