package com.oblenergo.enums.customerEnums;

/**
 * Created by us9522 on 14.02.2017.
 */
public enum TypeJoinEnum {

  NOTFULL("-"),
  STANDART("стандартне"),
  NONSTANDART("нестандартне"),
  TECHNICALREQUIREMENTS("технічні вимоги");

  String typeJoin;

  private TypeJoinEnum(String typeJoin){ this.typeJoin = typeJoin; }

  public String getTypeJoin(){
    return typeJoin;
  }
}
