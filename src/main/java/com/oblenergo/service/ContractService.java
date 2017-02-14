package com.oblenergo.service;

import com.oblenergo.model.Contract;

import java.util.List;

/**
 * Created by us9522 on 14.02.2017.
 */
public interface ContractService {

  public List<Contract> findAll();

  void save(Contract contract);

  void update(Contract contract);

  Contract findContractById(int id);

  void delete(int id);
}
