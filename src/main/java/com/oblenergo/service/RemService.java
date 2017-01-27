package com.oblenergo.service;

import com.oblenergo.model.Rem;

import java.util.List;

/**
 * Created by us9522 on 27.01.2017.
 */
public interface RemService {

  public List<Rem> findAll();

  void save(Rem rem);

  void update(Rem rem);

  Rem findRemById(int id);

  void delete(int id);
}
