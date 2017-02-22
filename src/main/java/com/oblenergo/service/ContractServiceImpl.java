package com.oblenergo.service;

import com.oblenergo.DAO.ContractDao;
import com.oblenergo.model.Contract;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * Created by us9522 on 14.02.2017.
 */
@Service
public class ContractServiceImpl implements ContractService {
  Logger LOGGER = Logger.getLogger(ContractServiceImpl.class);

  @Autowired
  ContractDao dao;

  @Transactional
  @Override
  public List<Contract> findAll() {
    try{
      return dao.findAllItems();
    }catch (DataAccessException dae){
      LOGGER.error("Unable to find all contract from DB", dae);
      throw dae;
    }
  }

  @Transactional
  @Override
  public void save(Contract contract) {
    try {
      dao.save(contract);
    }catch (DataAccessException dae){
      LOGGER.error("Unable to save contract to DB ", dae);
      throw dae;
    }
  }

  @Transactional
  @Override
  public void update(Contract contract) {
    try{
      Contract entity = dao.findById(contract.getId());
    }catch (DataAccessException dae){
      LOGGER.error("Unable to update rem");
      throw dae;
    }
  }

  @Transactional
  @Override
  public Contract findContractById(int id) {
    try {
      return dao.findById(id);
    }catch (DataAccessException dae){
      LOGGER.error("Unable to find contract with id" + id, dae);
      throw dae;
    }
  }

  @Transactional
  @Override
  public void delete(int id) {
    try {
      dao.delete(id);
    }catch (DataAccessException dae){
      LOGGER.error("Unable to delete contract from DB with id : " + id, dae);
      throw dae;
    }
  }
}
