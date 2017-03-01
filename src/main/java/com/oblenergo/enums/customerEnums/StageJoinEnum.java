package com.oblenergo.enums.customerEnums;

/**
 * Created by us9522 on 21.02.2017.
 */
public enum StageJoinEnum {
  NOTFULL("-"),
  FIRSTDEGREE("1 ступінь"),
  SECONDDEGREE("2 ступінь"),
  THIRDDEGREE("3 ступінь"),
  NONSTANDART("нестандартне"),
  TEMPORATY("тимчасові та тощо"),
  SUBSCRIBENETWORKS("від абоненських мереж"),
  GENERATION("генерація");

  private String stageJoin;

  private StageJoinEnum(String stageJoin){
    this.stageJoin = stageJoin;
  }

  public String getStageJoin() {
    return stageJoin;
  }
}
