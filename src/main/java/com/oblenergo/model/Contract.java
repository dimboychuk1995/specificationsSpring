package com.oblenergo.model;

import com.oblenergo.enums.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
  public int getId() {
    return id;
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
