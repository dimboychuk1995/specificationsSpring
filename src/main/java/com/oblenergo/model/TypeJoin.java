package com.oblenergo.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by us9522 on 14.02.2017.
 */
@Entity
@Table(name = "DIRECTORY_type_join")
public class TypeJoin implements Serializable {

  private int id;
  private String name;

  @Id
  @Column(name = "id")
  public int getId(){
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Column(name = "name")
  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }


  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this, true);
  }

  @Override
  public boolean equals(Object obj) {
    return EqualsBuilder.reflectionEquals(this, obj, true);
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
