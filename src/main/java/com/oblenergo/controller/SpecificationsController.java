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
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/specifications")
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
    model.addAttribute(REM_LIST, remServiceImpl.findAll());
    model.addAttribute(CONTRACT_LIST, contractServiceImpl.findAll());

    return "specifications";
  }

  @RequestMapping(value = "/contract/{id}", method = RequestMethod.GET)
  public String getContractById(@PathVariable int id, Model model){
    model.addAttribute(REM_LIST, remServiceImpl.findAll());
    model.addAttribute(CONTRACT, contractServiceImpl.findContractById(id));

    return "updateSpecifications";
  }
}
