package com.oblenergo.enums;

/**
 * Created by us9522 on 15.02.2017.
 */
public enum StatusDocumentEnum {

  CLEAR(""),
  PUBLISHED("виданий"),



  private String statusDocument;

  StatusDocumentEnum(String statusDocument){
    this.statusDocument = statusDocument;
  }

  public String getStatusDocument(){
    return statusDocument;
  }

}
