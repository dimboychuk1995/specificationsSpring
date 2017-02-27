package com.oblenergo.controller;

import com.oblenergo.model.Rem;
import com.oblenergo.service.RemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class RemController {
  //Logger LOGGER = Logger.getLogger(RemController.class);

  private static final String REM_LIST = "rem_list";
  private static final String REM = "rem";

  @Autowired
  private RemService remServiceImpl;


  @RequestMapping(method = RequestMethod.GET)
  public String getRemPage(@ModelAttribute("rem_list") Rem rem, Model model){
    model.addAttribute(REM_LIST, remServiceImpl.findAll());
    return "rem";
  }

  @RequestMapping(value = "/rem/{id}",method = RequestMethod.GET)
  public String getRemById(@PathVariable int id, Model model){
    model.addAttribute(REM, remServiceImpl.findRemById(id));
    return "updateRem";
  }

  @RequestMapping(value = "/rem/{id}",method = RequestMethod.POST)
  public String updateRem(@Validated Rem rem, BindingResult bindingResult,
                          Model model){
    if(bindingResult.hasErrors()){
      return "updateRem";
    }

    remServiceImpl.update(rem);
    return "redirect:/";
  }
}
