/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oblenergo.DAO;

import com.oblenergo.model.Rem;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author us9522
 */

@Repository
public class RemDaoImpl extends AbstractDao<Integer, Rem> implements RemDao {

  @SuppressWarnings("unchecked")
  @Override
  public List<Rem> findAllItems(){
    Criteria crit = createEntityCriteria();
    crit.addOrder(Order.asc("id"));
    return (List<Rem>) crit.list();
  }

  @Override
  public void save(Rem rem) {
    persist(rem);
  }

  @Override
  public Rem findById(int id){
    return getById(id);
  }

  @Override
  public void delete(int id){
    Criteria crit = createEntityCriteria();
    crit.add(Restrictions.eq("id", id));
    Rem rem = (Rem) crit.uniqueResult();
    delete(rem);
  }

}
