package com.oblenergo.enums;

/**
 * Created by us9522 on 14.02.2017.
 */
public enum ReasonTCEnum {

  NEWCONSTRUCTION("нове будівництво"),
  MOREPOWER("збільшення потужності");

  String reasonTC;

  private ReasonTCEnum(String reasonTC){ this.reasonTC = reasonTC; }

  public String getReasonTCEnum(){
    return reasonTC;
  }

}
