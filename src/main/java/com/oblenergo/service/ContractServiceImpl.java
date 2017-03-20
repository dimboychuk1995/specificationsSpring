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
    entity.setObject_name(contract.getObject_name());
    entity.setFunctional_target(contract.getFunctional_target());
    entity.setName_locality(contract.getName_locality());
    entity.setObject_adress(contract.getObject_adress());
    entity.setObject_zipcode(contract.getObject_zipcode());
    entity.setExecutorCompany(contract.getExecutorCompany());
    entity.setConnection_price(contract.getConnection_price());
    entity.setTc_pay_date(contract.getTc_pay_date());
    entity.setDate_intro_eksp(contract.getDate_intro_eksp());
    entity.setPrice_visit_obj(contract.getPrice_visit_obj());
    entity.setGeo_cord_1(contract.getGeo_cord_1());
    entity.setGeo_cord_2(contract.getGeo_cord_2());
    entity.setConnection_treaty_number(contract.getConnection_treaty_number());
    entity.setPoint_zab_power(contract.getPoint_zab_power());
    entity.setReliabylity_class_1_val(contract.getReliabylity_class_1_val());
    entity.setReliabylity_class_2_val(contract.getReliabylity_class_2_val());
    entity.setReliabylity_class_3_val(contract.getReliabylity_class_3_val());
    entity.setReliabylity_class_1_val_old(contract.getReliabylity_class_1_val_old());
    entity.setReliabylity_class_2_val_old(contract.getReliabylity_class_2_val_old());
    entity.setReliabylity_class_3_val_old(contract.getReliabylity_class_2_val_old());
    entity.setReliabylity_class_1_val_build(contract.getReliabylity_class_1_val_build());
    entity.setReliabylity_class_2_val_build(contract.getReliabylity_class_2_val_build());
    entity.setReliabylity_class_3_val_build(contract.getReliabylity_class_3_val_build());
    entity.setVoltage(contract.getVoltage());
    entity.setRequest_power(contract.getRequest_power());
    entity.setBuild_strum_power(contract.getBuild_strum_power());
    entity.setPower_for_electric_devices(contract.getPower_for_electric_devices());
    entity.setPower_for_environmental_reservation(contract.getPower_for_environmental_reservation());
    entity.setPower_for_emergency_reservation(contract.getPower_for_emergency_reservation());
    entity.setPower_for_technology_reservation(contract.getPower_for_technology_reservation());
    entity.setPower_boil(contract.getPower_boil());
    entity.setPower_plit(contract.getPower_plit());
    entity.setPower_old(contract.getPower_old());
    entity.setNom_data_dog(contract.getNom_data_dog());



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
