package com.oblenergo.DAO;

import com.oblenergo.model.Contract;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by us9522 on 14.02.2017.
 */
@Repository
public class ContractDaoImpl extends AbstractDao<Integer, Contract> implements ContractDao{

  @SuppressWarnings("unchecked")
  @Override
  public Contract findById(int id) {
    return getById(id);
  }

  @Override
  public List<Contract> findAllItems() {
    Criteria crit = createEntityCriteria();
    crit.addOrder(Order.asc("id"));
    return (List<Contract>) crit.list();
  }

  @Override
   public void save(Contract contract) {
    persist(contract);
  }

  @Override
  public void delete(int id) {
    Criteria crit = createEntityCriteria();
    crit.add(Restrictions.eq("id", id));
    Contract contract = (Contract) crit.uniqueResult();
    delete(contract);
  }
}
