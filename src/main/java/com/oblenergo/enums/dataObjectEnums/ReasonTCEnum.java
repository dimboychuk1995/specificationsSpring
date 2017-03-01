package com.oblenergo.enums.dataObjectEnums;

/**
 * Created by us9522 on 14.02.2017.
 */
public enum ReasonTCEnum {

  NOTFULL("-"),
  NEWCONSTRUCTION("нове будівництво"),
  MOREPOWER("збільшення потужності"),
  CHANGEPOINT("зміна точки приєднання"),
  CHANGECATEGORY("зміна категорії приєднання"),
  MODERNISATION("модернізація"),
  RECONSTRUCTION("реконструкція");


  private String reasonTC;

  private ReasonTCEnum(String reasonTC){ this.reasonTC = reasonTC; }

  public String getReasonTCEnum(){
    return reasonTC;
  }

}
