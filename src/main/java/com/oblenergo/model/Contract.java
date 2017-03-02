package com.oblenergo.model;

import com.oblenergo.enums.customerEnums.*;
import com.oblenergo.enums.dataObjectEnums.ExecutorCompanyEnum;
import com.oblenergo.enums.dataObjectEnums.ReasonTCEnum;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by us9522 on 14.02.2017.
 */
@Entity
@Table(name = "contracts")
public class Contract implements Serializable {

  private int id;
  private Rem rem;

  //Customer
  private CustomerSocStatusEnum customerSocStatus = CustomerSocStatusEnum.valueOf("NOTFULL");
  private TypeContractEnum typeContract = TypeContractEnum.valueOf("NOTFULL");
  private TypeJoinEnum typeJoin = TypeJoinEnum.valueOf("NOTFULL");
  private CustomerTypeEnum customerType = CustomerTypeEnum.valueOf("NOTFULL");
  private StageJoinEnum stageJoin = StageJoinEnum.valueOf("NOTFULL");
  private String registrationDate;
  private String fName;
  private String sName;
  private String tName;
  private String customer_post;
  private String constitutiveDocuments;
  private String bank_account;
  private String bank_mfo;
  private String bank_identification_number;
  private String taxpayer;
  private String customer_locality;
  private String customer_adress;
  private String customer_telephone;
  private String customer_zipcode;

  //dataobject
  private ReasonTCEnum reasonTC = ReasonTCEnum.valueOf("NOTFULL");
  private String object_name;
  private String functional_target;
  private String name_locality;
  private String object_adress;
  private String object_zipcode;
  private ExecutorCompanyEnum executorCompany = ExecutorCompanyEnum.valueOf("NOTFULL");
  private String connection_price;
  private String tc_pay_date;
  private String date_intro_eksp;
  private String price_visit_obj;
  private String geo_cord_1;
  private String geo_cord_2;
  private String connection_treaty_number;
  private String point_zab_power;
  private String reliabylity_class_1_val;
  private String reliabylity_class_2_val;
  private String reliabylity_class_3_val;
  private String reliabylity_class_1_val_old;
  private String reliabylity_class_2_val_old;
  private String reliabylity_class_3_val_old;
  private String reliabylity_class_1_val_build;
  private String reliabylity_class_2_val_build;
  private String reliabylity_class_3_val_build;
  private String voltage;
  private String request_power;
  private String build_strum_power;
  private String power_for_electric_devices;
  private String power_for_environmental_reservation;
  private String power_for_emergency_reservation;
  private String power_for_technology_reservation;
  private String power_boil;
  private String power_plit;
  private String power_old;
  private String nom_data_dog;





  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int getId() {
    return id;
  }

  @ManyToOne(optional = false)
  @JoinColumn(name = "rem", referencedColumnName = "id")
  public Rem getRem(){ return rem; }


  //customer getters
  @Enumerated(EnumType.STRING)
  @Column(name = "customerSocStatus")
  public CustomerSocStatusEnum getCustomerSocStatus(){ return customerSocStatus; }

  @Enumerated(EnumType.STRING)
  @Column(name = "typeContract")
  public TypeContractEnum getTypeContract(){ return typeContract; }

  @Enumerated(EnumType.STRING)
  @Column(name = "typeJoin")
  public TypeJoinEnum getTypeJoin(){ return typeJoin; }

  @Enumerated(EnumType.STRING)
  @Column(name = "customerType")
  public CustomerTypeEnum getCustomerType(){ return customerType; }

  @Enumerated(EnumType.STRING)
  @Column(name = "stageJoin")
  public StageJoinEnum getStageJoin(){ return stageJoin; }

  @Column(name = "registrationDate")
  public String getRegistrationDate() {
    return registrationDate;
  }

  @Column(name = "fName")
  public String getfName() {
    return fName;
  }

  @Column(name = "sName")
  public String getsName() {
    return sName;
  }

  @Column(name = "tName")
  public String gettName() {
    return tName;
  }

  @Column(name = "customer_post")
  public String getCustomer_post() {
    return customer_post;
  }

  @Column(name = "constitutiveDocuments")
  public String getConstitutiveDocuments(){ return constitutiveDocuments; }

  @Column(name = "bank_account")
  public String getBank_account() {
    return bank_account;
  }

  @Column(name = "bank_mfo")
  public String getBank_mfo() {
    return bank_mfo;
  }

  @Column(name = "bank_identification_number")
  public String getBank_identification_number() {
    return bank_identification_number;
  }

  @Column(name = "taxpayer")
  public String getTaxpayer() {
    return taxpayer;
  }

  @Column(name = "customer_locality")
  public String getCustomer_locality() {
    return customer_locality;
  }

  @Column(name = "customer_adress")
  public String getCustomer_adress() {
    return customer_adress;
  }

  @Column(name = "customer_telephone")
  public String getCustomer_telephone() {
    return customer_telephone;
  }

  @Column(name = "customer_zipcode")
  public String getCustomer_zipcode() {
    return customer_zipcode;
  }


  //dataobject getters
  @Enumerated(EnumType.STRING)
  @Column(name = "reasonTC")
  public ReasonTCEnum getReasonTC() {
    return reasonTC;
  }

  @Column(name = "object_name")
  public String getObject_name() {
    return object_name;
  }

  @Column(name = "functional_target")
  public String getFunctional_target() {
    return functional_target;
  }

  @Column(name = "name_locality")
  public String getName_locality() {
    return name_locality;
  }

  @Column(name = "object_adress")
  public String getObject_adress() {
    return object_adress;
  }

  @Column(name = "object_zipcode")
  public String getObject_zipcode() {
    return object_zipcode;
  }

  @Column(name = "executorCompany")
  public ExecutorCompanyEnum getExecutorCompany() {
    return executorCompany;
  }

  @Column(name = "connection_price")
  public String getConnection_price() {
    return connection_price;
  }

  @Column(name = "tc_pay_date")
  public String getTc_pay_date() {
    return tc_pay_date;
  }

  @Column(name = "date_intro_eksp")
  public String getDate_intro_eksp() {
    return date_intro_eksp;
  }

  @Column(name = "price_visit_obj")
  public String getPrice_visit_obj() {
    return price_visit_obj;
  }

  @Column(name = "geo_cord_1")
  public String getGeo_cord_1() {
    return geo_cord_1;
  }

  @Column(name = "geo_cord_2")
  public String getGeo_cord_2() {
    return geo_cord_2;
  }

  @Column(name = "connection_treaty_number")
  public String getConnection_treaty_number() {
    return connection_treaty_number;
  }

  @Column(name = "point_zab_power")
  public String getPoint_zab_power() {
    return point_zab_power;
  }

  @Column(name = "reliabylity_class_1_val")
  public String getReliabylity_class_1_val() {
    return reliabylity_class_1_val;
  }

  @Column(name = "reliabylity_class_2_val")
  public String getReliabylity_class_2_val() {
    return reliabylity_class_2_val;
  }

  @Column(name = "reliabylity_class_3_val")
  public String getReliabylity_class_3_val() {
    return reliabylity_class_3_val;
  }

  @Column(name = "reliabylity_class_1_val_old")
  public String getReliabylity_class_1_val_old() {
    return reliabylity_class_1_val_old;
  }

  @Column(name = "reliabylity_class_2_val_old")
  public String getReliabylity_class_2_val_old() {
    return reliabylity_class_2_val_old;
  }

  @Column(name = "reliabylity_class_3_val_old")
  public String getReliabylity_class_3_val_old() {
    return reliabylity_class_3_val_old;
  }

  @Column(name = "reliabylity_class_1_val_build")
  public String getReliabylity_class_1_val_build() {
    return reliabylity_class_1_val_build;
  }

  @Column(name = "reliabylity_class_2_val_build")
  public String getReliabylity_class_2_val_build() {
    return reliabylity_class_2_val_build;
  }

  @Column(name = "reliabylity_class_3_val_build")
  public String getReliabylity_class_3_val_build() {
    return reliabylity_class_3_val_build;
  }

  @Column(name = "voltage")
  public String getVoltage() {
    return voltage;
  }

  @Column(name = "request_power")
  public String getRequest_power() {
    return request_power;
  }

  @Column(name = "build_strum_power")
  public String getBuild_strum_power() {
    return build_strum_power;
  }

  @Column(name = "power_for_electric_devices")
  public String getPower_for_electric_devices() {
    return power_for_electric_devices;
  }

  @Column(name = "power_for_environmental_reservation")
  public String getPower_for_environmental_reservation() {
    return power_for_environmental_reservation;
  }

  @Column(name = "power_for_emergency_reservation")
  public String getPower_for_emergency_reservation() {
    return power_for_emergency_reservation;
  }

  @Column(name = "power_for_technology_reservation")
  public String getPower_for_technology_reservation() {
    return power_for_technology_reservation;
  }

  @Column(name = "power_boil")
  public String getPower_boil() {
    return power_boil;
  }

  @Column(name = "power_plit")
  public String getPower_plit() {
    return power_plit;
  }

  @Column(name = "power_old")
  public String getPower_old() {
    return power_old;
  }

  @Column(name = "nom_data_dog")
  public String getNom_data_dog() {
    return nom_data_dog;
  }

  //customer setters
  public void setId(int id) {
    this.id = id;
  }

  public void setRem(Rem rem) {
    this.rem = rem;
  }

  public void setCustomerSocStatus(CustomerSocStatusEnum customerSocStatus){ this.customerSocStatus = customerSocStatus; }

  public void setTypeContract(TypeContractEnum typeContract) {
    this.typeContract = typeContract;
  }

  public void setTypeJoin(TypeJoinEnum typeJoin) {
    this.typeJoin = typeJoin;
  }

  public void setCustomerType(CustomerTypeEnum customerType) {
    this.customerType = customerType;
  }

  public void setStageJoin(StageJoinEnum stageJoin) {
    this.stageJoin = stageJoin;
  }

  public void setRegistrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
  }

  public void setfName(String fName) {
    this.fName = fName;
  }

  public void setsName(String sName) {
    this.sName = sName;
  }

  public void settName(String tName) {
    this.tName = tName;
  }

  public void setCustomer_post(String customer_post) {
    this.customer_post = customer_post;
  }

  public void setConstitutiveDocuments(String constitutiveDocuments) {
    this.constitutiveDocuments = constitutiveDocuments;
  }

  public void setBank_account(String bank_account) {
    this.bank_account = bank_account;
  }

  public void setBank_mfo(String bank_mfo) {
    this.bank_mfo = bank_mfo;
  }

  public void setBank_identification_number(String bank_identification_number) {
    this.bank_identification_number = bank_identification_number;
  }

  public void setTaxpayer(String taxpayer) {
    this.taxpayer = taxpayer;
  }

  public void setCustomer_locality(String customer_locality) {
    this.customer_locality = customer_locality;
  }

  public void setCustomer_adress(String customer_adress) {
    this.customer_adress = customer_adress;
  }

  public void setCustomer_telephone(String customer_telephone) {
    this.customer_telephone = customer_telephone;
  }

  public void setCustomer_zipcode(String customer_zipcode) {
    this.customer_zipcode = customer_zipcode;
  }

  //dataobject setters
  public void setReasonTC(ReasonTCEnum reasonTC) {
    this.reasonTC = reasonTC;
  }

  public void setObject_name(String object_name) {
    this.object_name = object_name;
  }

  public void setFunctional_target(String functional_target) {
    this.functional_target = functional_target;
  }

  public void setName_locality(String name_locality) {
    this.name_locality = name_locality;
  }

  public void setObject_adress(String object_adress) {
    this.object_adress = object_adress;
  }

  public void setObject_zipcode(String object_zipcode) {
    this.object_zipcode = object_zipcode;
  }

  public void setExecutorCompany(ExecutorCompanyEnum executorCompany) {
    this.executorCompany = executorCompany;
  }

  public void setConnection_price(String connection_price) {
    this.connection_price = connection_price;
  }

  public void setTc_pay_date(String tc_pay_date) {
    this.tc_pay_date = tc_pay_date;
  }

  public void setDate_intro_eksp(String date_intro_eksp) {
    this.date_intro_eksp = date_intro_eksp;
  }

  public void setPrice_visit_obj(String price_visit_obj) {
    this.price_visit_obj = price_visit_obj;
  }

  public void setGeo_cord_1(String geo_cord_1) {
    this.geo_cord_1 = geo_cord_1;
  }

  public void setGeo_cord_2(String geo_cord_2) {
    this.geo_cord_2 = geo_cord_2;
  }

  public void setConnection_treaty_number(String connection_treaty_number) {
    this.connection_treaty_number = connection_treaty_number;
  }

  public void setPoint_zab_power(String point_zab_power) {
    this.point_zab_power = point_zab_power;
  }

  public void setReliabylity_class_1_val(String reliabylity_class_1_val) {
    this.reliabylity_class_1_val = reliabylity_class_1_val;
  }

  public void setReliabylity_class_2_val(String reliabylity_class_2_val) {
    this.reliabylity_class_2_val = reliabylity_class_2_val;
  }

  public void setReliabylity_class_3_val(String reliabylity_class_3_val) {
    this.reliabylity_class_3_val = reliabylity_class_3_val;
  }

  public void setReliabylity_class_1_val_old(String reliabylity_class_1_val_old) {
    this.reliabylity_class_1_val_old = reliabylity_class_1_val_old;
  }

  public void setReliabylity_class_2_val_old(String reliabylity_class_2_val_old) {
    this.reliabylity_class_2_val_old = reliabylity_class_2_val_old;
  }

  public void setReliabylity_class_3_val_old(String reliabylity_class_3_val_old) {
    this.reliabylity_class_3_val_old = reliabylity_class_3_val_old;
  }

  public void setReliabylity_class_1_val_build(String reliabylity_class_1_val_build) {
    this.reliabylity_class_1_val_build = reliabylity_class_1_val_build;
  }

  public void setReliabylity_class_2_val_build(String reliabylity_class_2_val_build) {
    this.reliabylity_class_2_val_build = reliabylity_class_2_val_build;
  }

  public void setReliabylity_class_3_val_build(String reliabylity_class_3_val_build) {
    this.reliabylity_class_3_val_build = reliabylity_class_3_val_build;
  }

  public void setVoltage(String voltage) {
    this.voltage = voltage;
  }

  public void setRequest_power(String request_power) {
    this.request_power = request_power;
  }

  public void setBuild_strum_power(String build_strum_power) {
    this.build_strum_power = build_strum_power;
  }

  public void setPower_for_electric_devices(String power_for_electric_devices) {
    this.power_for_electric_devices = power_for_electric_devices;
  }

  public void setPower_for_environmental_reservation(String power_for_environmental_reservation) {
    this.power_for_environmental_reservation = power_for_environmental_reservation;
  }

  public void setPower_for_emergency_reservation(String power_for_emergency_reservation) {
    this.power_for_emergency_reservation = power_for_emergency_reservation;
  }

  public void setPower_for_technology_reservation(String power_for_technology_reservation) {
    this.power_for_technology_reservation = power_for_technology_reservation;
  }

  public void setPower_boil(String power_boil) {
    this.power_boil = power_boil;
  }

  public void setPower_plit(String power_plit) {
    this.power_plit = power_plit;
  }

  public void setPower_old(String power_old) {
    this.power_old = power_old;
  }

  public void setNom_data_dog(String nom_data_dog) {
    this.nom_data_dog = nom_data_dog;
  }
}
