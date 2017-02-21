package com.oblenergo.editor;

import com.oblenergo.model.Rem;
import com.oblenergo.service.RemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

/**
 * Created by us9522 on 21.02.2017.
 */
@Component
public class RemEditor extends PropertyEditorSupport {

  @Autowired
  RemService remServiceImpl;

  @Override
  public void setAsText(String text) throws IllegalArgumentException{
    Rem instance = remServiceImpl.findRemById(Integer.parseInt(text));

    this.setValue(instance);
  }

}
