package com.oblenergo.enums;

/**
 * Created by us9522 on 15.02.2017.
 */
public enum CustomerSocStatusEnum {

  NOTFULL("-"),
  CITIZEN("громадянин"),
  CHURCH("церква");


  private String customerSocStatus;

  private CustomerSocStatusEnum(String customerSocStatus){
    this.customerSocStatus = customerSocStatus;
  }

  public String getCustomerSocStatus(){
    return customerSocStatus;
  }
}
