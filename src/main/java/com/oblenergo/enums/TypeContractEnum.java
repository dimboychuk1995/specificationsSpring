package com.oblenergo.enums;

/**
 * Created by us9522 on 14.02.2017.
 */
public enum TypeContractEnum {

  NOTFULL("-"),
  BASIC("основний"),
  BUILDINGSITE("будмайданчик");

  String typeContract;

  private TypeContractEnum(String typeContract){
    this.typeContract = typeContract;
  }

  public String getTypeContract(){
    return typeContract;
  }

}
