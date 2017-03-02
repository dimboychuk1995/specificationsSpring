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

    Contract entity = null;

    try{
      entity = dao.findById(contract.getId());
    }catch (DataAccessException dae){
      LOGGER.error("Unable to update rem");
      throw dae;
    }

    //customer
    entity.setCustomerSocStatus(contract.getCustomerSocStatus());
    entity.setTypeContract(contract.getTypeContract());
    entity.setTypeJoin(contract.getTypeJoin());
    entity.setCustomerType(contract.getCustomerType());
    entity.setStageJoin(contract.getStageJoin());
    entity.setRegistrationDate(contract.getRegistrationDate());
    entity.setfName(contract.getfName());
    entity.setsName(contract.getsName());
    entity.settName(contract.gettName());
    entity.setCustomer_post(contract.getCustomer_post());
    entity.setConstitutiveDocuments(contract.getConstitutiveDocuments());
    entity.setBank_account(contract.getBank_account());
    entity.setBank_mfo(contract.getBank_mfo());
    entity.setBank_identification_number(contract.getBank_identification_number());
    entity.setTaxpayer(contract.getTaxpayer());
    entity.setCustomer_locality(contract.getCustomer_locality());
    entity.setCustomer_adress(contract.getCustomer_adress());
    entity.setCustomer_telephone(contract.getCustomer_telephone());
    entity.setCustomer_zipcode(contract.getCustomer_zipcode());

    //dataobject
    entity.setReasonTC(contract.getReasonTC());

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
