package com.oblenergo.enums.dataObjectEnums;

/**
 * Created by us9522 on 01.03.2017.
 */
public enum ExecutorCompanyEnum {

  NOTFULL("-"),
  REM("РЕМ"),
  VTP("ВТП");

  private String executorCompany;

  private ExecutorCompanyEnum(String executorCompany){
    this.executorCompany = executorCompany;
  }

  public String getExecutorCompany(){
    return executorCompany;
  }
}
