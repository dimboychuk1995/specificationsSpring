package com.oblenergo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by us9522 on 14.02.2017.
 */
@Entity
@Table(name = "contracts")
public class Contract implements Serializable {

  private int id;

  @Id
  @Column(name = "id")
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


}
