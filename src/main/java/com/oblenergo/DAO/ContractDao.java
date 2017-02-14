package com.oblenergo.DAO;

import com.oblenergo.model.Contract;

import java.util.List;

/**
 * Created by us9522 on 14.02.2017.
 */
public interface ContractDao {

  Contract findById(int id);

  List<Contract> findAllItems();

  void save(Contract contract);

  void delete(int id);
}
