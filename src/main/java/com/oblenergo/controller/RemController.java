package com.oblenergo.controller;

import com.oblenergo.service.RemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by us9522 on 30.01.2017.
 */
@Controller
@RequestMapping("/rem")
public class RemController {
  private static final String REM_LIST = "rem_list";

  @Autowired
  private RemService remServiceImpl;

  @RequestMapping(method = RequestMethod.GET)
  public String getRemPage(@Validated @ModelAttribute("rem_list") Model model){
    model.addAttribute(REM_LIST, remServiceImpl.findAll());
    System.out.println("I was here");
    return "rem";
  }
}
