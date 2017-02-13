package com.oblenergo.model;

/**
 * Created by us9522 on 27.01.2017.
 */
public class Rem {

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

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getRem_name() {
    return rem_name;
  }

  public void setRem_name(String rem_name) {
    this.rem_name = rem_name;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String getContacts() {
    return contacts;
  }

  public void setContacts(String contacts) {
    this.contacts = contacts;
  }

  public String getRek_bank() {
    return rek_bank;
  }

  public void setRek_bank(String rek_bank) {
    this.rek_bank = rek_bank;
  }

  public String getRem_licality() {
    return rem_licality;
  }

  public void setRem_licality(String rem_licality) {
    this.rem_licality = rem_licality;
  }

  public String getDirector_rod() {
    return director_rod;
  }

  public void setDirector_rod(String director_rod) {
    this.director_rod = director_rod;
  }

  public String getDirector_dav() {
    return director_dav;
  }

  public void setDirector_dav(String director_dav) {
    this.director_dav = director_dav;
  }

  public String getDovirenist() {
    return dovirenist;
  }

  public void setDovirenist(String dovirenist) {
    this.dovirenist = dovirenist;
  }

  public String getGolovnyi_ingener() {
    return golovnyi_ingener;
  }

  public void setGolovnyi_ingener(String golovnyi_ingener) {
    this.golovnyi_ingener = golovnyi_ingener;
  }

  public String getVykonavets() {
    return vykonavets;
  }

  public void setVykonavets(String vykonavets) {
    this.vykonavets = vykonavets;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getRek_bank_with_spec() {
    return rek_bank_with_spec;
  }

  public void setRek_bank_with_spec(String rek_bank_with_spec) {
    this.rek_bank_with_spec = rek_bank_with_spec;
  }

  public String getRek_bank_without_spec() {
    return rek_bank_without_spec;
  }

  public void setRek_bank_without_spec(String rek_bank_without_spec) {
    this.rek_bank_without_spec = rek_bank_without_spec;
  }

  public String getCity_town_village() {
    return city_town_village;
  }

  public void setCity_town_village(String city_town_village) {
    this.city_town_village = city_town_village;
  }



  @Override
  public String toString() {
    return "rem{" +
            "id=" + id +
            ", rem_name='" + rem_name + '\'' +
            ", director='" + director + '\'' +
            ", contacts='" + contacts + '\'' +
            ", rek_bank='" + rek_bank + '\'' +
            ", rem_licality='" + rem_licality + '\'' +
            ", director_rod='" + director_rod + '\'' +
            ", director_dav='" + director_dav + '\'' +
            ", dovirenist='" + dovirenist + '\'' +
            ", golovnyi_ingener='" + golovnyi_ingener + '\'' +
            ", vykonavets='" + vykonavets + '\'' +
            ", region='" + region + '\'' +
            ", rek_bank_with_spec='" + rek_bank_with_spec + '\'' +
            ", rek_bank_without_spec='" + rek_bank_without_spec + '\'' +
            ", city_town_village='" + city_town_village + '\'' +
            '}';
  }
}
