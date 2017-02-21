package com.oblenergo.controller;

import com.oblenergo.editor.RemEditor;
import com.oblenergo.model.Contract;
import com.oblenergo.model.Rem;
import com.oblenergo.service.ContractService;
import com.oblenergo.service.RemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by us9522 on 21.02.2017.
 */

@Controller
@RequestMapping("/specifications")
public class SpecificationsController {

  private static final String CONTRACT_LIST = "contract_list";
  private static final String CONTRACT = "contract";
  private static final String REM_LIST = "rem_list";

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
    System.err.println("I'm here");
    model.addAttribute(REM_LIST, remServiceImpl.findAll());
    model.addAttribute(CONTRACT_LIST, contractServiceImpl.findAll());

    return "specifications";
  }
}
