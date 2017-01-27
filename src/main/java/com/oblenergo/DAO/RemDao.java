/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oblenergo.DAO;

import com.oblenergo.model.Rem;

import java.util.List;

/**
 *
 * @author us9522
 */
public interface RemDao {

  Rem findById(int id);

  List<Rem> findAllItems();

  void save(Rem car);

  void delete(int id);
}
