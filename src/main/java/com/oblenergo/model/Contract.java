package com.oblenergo.model;

import com.oblenergo.enums.*;

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
  private TypeContractEnum typeContract = TypeContractEnum.valueOf("NOTFULL");
  private TypeJoinEnum typeJoin = TypeJoinEnum.valueOf("NOTFULL");
  private CustomerTypeEnum customerType = CustomerTypeEnum.valueOf("NOTFULL");
  private StageJoinEnum stageJoin = StageJoinEnum.valueOf("NOTFULL");
  private String registration_date;
  private String fName;
  private String sName;
  private String tName;
  private String customer_post;
  private ConstitutiveDocumentsEnum constitutiveDocuments = ConstitutiveDocumentsEnum.valueOf("NOTFULL");
  private String bank_account;
  private String bank_mfo;
  private String bank_identification_number;
  private String taxpayer;
  private String customer_locality;
  private String customer_adress;
  private String customer_telephone;
  private String customer_zipcode;




  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int getId() {
    return id;
  }

  @ManyToOne(optional = false)
  @JoinColumn(name = "rem", referencedColumnName = "id")
  public Rem getRem(){ return rem; }

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

  @Column(name = "registration_date")
  public String getRegistration_date() {
    return registration_date;
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

  @Enumerated(EnumType.STRING)
  @Column(name = "constitutiveDocuments")
  public ConstitutiveDocumentsEnum getConstitutiveDocuments(){ return constitutiveDocuments; }

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

  public void setId(int id) {
    this.id = id;
  }

  public void setRem(Rem rem) {
    this.rem = rem;
  }

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

  public void setRegistration_date(String registration_date) {
    this.registration_date = registration_date;
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

  public void setConstitutiveDocuments(ConstitutiveDocumentsEnum constitutiveDocuments) {
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
}
