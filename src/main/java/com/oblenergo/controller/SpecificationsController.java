package com.oblenergo.controller;

import com.oblenergo.editor.RemEditor;
import com.oblenergo.enums.customerEnums.*;
import com.oblenergo.enums.dataObjectEnums.ExecutorCompanyEnum;
import com.oblenergo.enums.dataObjectEnums.ReasonTCEnum;
import com.oblenergo.enums.directoryEnum.ConstitutiveDocumentsEnum;
import com.oblenergo.model.Contract;
import com.oblenergo.model.Rem;
import com.oblenergo.service.ContractService;
import com.oblenergo.service.RemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/specifications")
public class SpecificationsController {

  private static final String CONTRACT_LIST = "contract_list";
  private static final String CONTRACT = "contract";
  private static final String REM_LIST = "rem_list";

  /* enums */
  private static final String CUSTOMER_SOC_STATUS = "CustomerSocStatusEnum";
  private static final String CUSTOMER_TYPE_ENUM = "CustomerTypeEnum";
  private static final String TYPE_CONTRACT_ENUM = "TypeContractEnum";
  private static final String TYPE_JOIN_ENUM = "TypeJoinEnum";
  private static final String STAGE_JOIN_ENUM = "StageJoinEnum";
  private static final String CONSTITUVE_DOCUMENT_ENUM = "ConstitutiveDocumentsEnum";
  private static final String REASON_TC_ENUM = "ReasonTCEnum";
  private static final String EXECUTOR_COMPANY_ENUM = "ExecutorCompanyEnum";

  @Autowired
  private ContractService contractServiceImpl;

  @Autowired
  private RemService remServiceImpl;

  @Autowired
  private RemEditor remEditor;

  @InitBinder("contract")
  public void initBinderContract(WebDataBinder binder){
    binder.registerCustomEditor(Rem.class, remEditor);
  }

  @RequestMapping(method = RequestMethod.GET)
  public String getContractPage(@ModelAttribute("contract_list")Contract contract, Model model){
    model.addAttribute(REM_LIST, remServiceImpl.findAll());
    model.addAttribute(CONTRACT_LIST, contractServiceImpl.findAll());

    return "specifications";
  }

  @RequestMapping(value = "/contract/{id}", method = RequestMethod.GET)
  public String getContractById(@PathVariable int id, Model model){
    model.addAttribute(REM_LIST, remServiceImpl.findAll());
    model.addAttribute(CONTRACT, contractServiceImpl.findContractById(id));
    model.addAttribute(CUSTOMER_SOC_STATUS, CustomerSocStatusEnum.values());
    model.addAttribute(CUSTOMER_TYPE_ENUM, CustomerTypeEnum.values());
    model.addAttribute(TYPE_CONTRACT_ENUM, TypeContractEnum.values());
    model.addAttribute(TYPE_JOIN_ENUM, TypeJoinEnum.values());
    model.addAttribute(STAGE_JOIN_ENUM, StageJoinEnum.values());
    model.addAttribute(CONSTITUVE_DOCUMENT_ENUM, ConstitutiveDocumentsEnum.values());
    model.addAttribute(REASON_TC_ENUM, ReasonTCEnum.values());
    model.addAttribute(EXECUTOR_COMPANY_ENUM, ExecutorCompanyEnum.values());

    return "updateSpecifications";
  }

  @RequestMapping(value = "/contract/{id}", method = RequestMethod.POST)
  public String updateContract(@Validated Contract contract, BindingResult bindingResult, Model model){
    if (bindingResult.hasErrors()){
      return "updateSpecifications";
    }

    contractServiceImpl.update(contract);
    return "redirect:/specifications";
  }

  @RequestMapping(value = "/contract/delete/{id}", method = RequestMethod.GET)
  public String deleteContract(@Validated Contract contract){

    contractServiceImpl.delete(contract.getId());

    return "redirect:/specifications";
  }

}
