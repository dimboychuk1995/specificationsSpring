package com.oblenergo.enums;

/**
 * Created by us9522 on 15.02.2017.
 */
public enum StatusDocumentEnum {

  CLEAR("не виданий"),
  PUBLISHED("виданий"),
  NOTCONCLUDED("не укладений"),
  CUSTOMERREFUSESIGNING("відмова замовника від укладення"),
  CONCLUDED("укладений"),
  EXPIRED("втратив чиність"),
  EXTENDED("продовжений"),
  RUPTURED("розірваний"),
  DONE("виконано"),
  FAILED("не виконано"),
  THREECOPIES("три примірника"),
  CHANGED("змінений"),
  REMTRANFERRED("передано у РЕМ"),
  REFUSALTOOBTAININGSPECIFICATIONS("відмова у отриманні ТУ");

  private String statusDocument;

  StatusDocumentEnum(String statusDocument){
    this.statusDocument = statusDocument;
  }

  public String getStatusDocument(){
    return statusDocument;
  }

}
