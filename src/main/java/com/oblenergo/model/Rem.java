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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Rem rem = (Rem) o;

    if (id != rem.id) return false;
    if (city_town_village != null ? !city_town_village.equals(rem.city_town_village) : rem.city_town_village != null)
      return false;
    if (contacts != null ? !contacts.equals(rem.contacts) : rem.contacts != null) return false;
    if (director != null ? !director.equals(rem.director) : rem.director != null) return false;
    if (director_dav != null ? !director_dav.equals(rem.director_dav) : rem.director_dav != null) return false;
    if (director_rod != null ? !director_rod.equals(rem.director_rod) : rem.director_rod != null) return false;
    if (dovirenist != null ? !dovirenist.equals(rem.dovirenist) : rem.dovirenist != null) return false;
    if (golovnyi_ingener != null ? !golovnyi_ingener.equals(rem.golovnyi_ingener) : rem.golovnyi_ingener != null)
      return false;
    if (region != null ? !region.equals(rem.region) : rem.region != null) return false;
    if (rek_bank != null ? !rek_bank.equals(rem.rek_bank) : rem.rek_bank != null) return false;
    if (rek_bank_with_spec != null ? !rek_bank_with_spec.equals(rem.rek_bank_with_spec) : rem.rek_bank_with_spec != null)
      return false;
    if (rek_bank_without_spec != null ? !rek_bank_without_spec.equals(rem.rek_bank_without_spec) : rem.rek_bank_without_spec != null)
      return false;
    if (rem_licality != null ? !rem_licality.equals(rem.rem_licality) : rem.rem_licality != null) return false;
    if (rem_name != null ? !rem_name.equals(rem.rem_name) : rem.rem_name != null) return false;
    if (vykonavets != null ? !vykonavets.equals(rem.vykonavets) : rem.vykonavets != null) return false;

    return true;
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

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (rem_name != null ? rem_name.hashCode() : 0);
    result = 31 * result + (director != null ? director.hashCode() : 0);
    result = 31 * result + (contacts != null ? contacts.hashCode() : 0);
    result = 31 * result + (rek_bank != null ? rek_bank.hashCode() : 0);
    result = 31 * result + (rem_licality != null ? rem_licality.hashCode() : 0);
    result = 31 * result + (director_rod != null ? director_rod.hashCode() : 0);
    result = 31 * result + (director_dav != null ? director_dav.hashCode() : 0);
    result = 31 * result + (dovirenist != null ? dovirenist.hashCode() : 0);
    result = 31 * result + (golovnyi_ingener != null ? golovnyi_ingener.hashCode() : 0);
    result = 31 * result + (vykonavets != null ? vykonavets.hashCode() : 0);
    result = 31 * result + (region != null ? region.hashCode() : 0);
    result = 31 * result + (rek_bank_with_spec != null ? rek_bank_with_spec.hashCode() : 0);
    result = 31 * result + (rek_bank_without_spec != null ? rek_bank_without_spec.hashCode() : 0);
    result = 31 * result + (city_town_village != null ? city_town_village.hashCode() : 0);
    return result;


  }
}
