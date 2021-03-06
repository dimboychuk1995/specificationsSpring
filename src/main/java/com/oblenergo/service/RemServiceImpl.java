package com.oblenergo.service;

import com.oblenergo.DAO.RemDao;
import com.oblenergo.model.Rem;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by us9522 on 27.01.2017.
 */
@Service
public class RemServiceImpl implements RemService {
  Logger LOGGER = Logger.getLogger(RemServiceImpl.class);

  @Autowired
  RemDao dao;

  @Transactional
  @Override
  public List<Rem> findAll() {
    try {
      return dao.findAllItems();
    }catch (DataAccessException dae){
      LOGGER.error("Unable to find all rems from DB ", dae);
      throw dae;
    }
  }

  @Transactional
  @Override
  public void save(Rem rem) {
    try {
      dao.save(rem);
    }catch (DataAccessException dae){
      LOGGER.error("Unable to save rem to DB ", dae);
      throw dae;
    }
  }

  @Transactional
  @Override
  public void update(Rem rem) {
    try {
      Rem entity = dao.findById(rem.getId());
      //entity.setRem_name(rem.getRem_name());
      entity.setDirector(rem.getDirector());
      entity.setContacts(rem.getContacts());
      entity.setRek_bank(rem.getRek_bank());
      entity.setRem_licality(rem.getRem_licality());
      entity.setDirector_rod(rem.getDirector_rod());
      entity.setDirector_dav(rem.getDirector_dav());
      entity.setDovirenist(rem.getDovirenist());
      entity.setGolovnyi_ingener(rem.getGolovnyi_ingener());
      entity.setVykonavets(rem.getVykonavets());
      entity.setRegion(rem.getRegion());
      entity.setRek_bank_with_spec(rem.getRek_bank_with_spec());
      entity.setRek_bank_without_spec(rem.getRek_bank_without_spec());
      entity.setCity_town_village(rem.getCity_town_village());
    }catch (DataAccessException dae){
      LOGGER.error("Unable to find rem with id" + rem.getId(), dae);
      throw dae;
    }
  }

  @Transactional
  @Override
  public Rem findRemById(int id) {
    try {
      return dao.findById(id);
    }catch (DataAccessException dae){
      LOGGER.error("Unable to find rem with id" + id, dae);
      throw dae;
    }
  }

  @Transactional
  @Override
  public void delete(int id) {
    try {
      dao.delete(id);
    }catch (DataAccessException dae){
      LOGGER.error("Unable to delete rem from DB with id : " + id, dae);
      throw dae;
    }
  }
}
