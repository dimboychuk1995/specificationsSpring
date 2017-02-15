package com.oblenergo.enums;

/**
 * Created by us9522 on 15.02.2017.
 */
public enum  CustomerTypeEnum {

  LAWCONSUMER("Юридичний споживач"),
  URIDICALCONSUMER("Побутовий споживач");

  private String customerType;

  CustomerTypeEnum(String customerType){
    this.customerType = customerType;
  }

  public String getCustomerType(){
    return customerType;
  }

}
