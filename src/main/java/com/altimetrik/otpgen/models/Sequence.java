package com.altimetrik.otpgen.models;


import java.util.Objects;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;






@Entity

public class Sequence  {
  
  
   
  
  @Id
   
  
  private String sequenceId = null;
  
   
   
  
  private Integer sequenceValue = null;

  
  /**
   * {"primaryKey":true}
   **/
  public String getSequenceId() {
    return sequenceId;
  }
  public void setSequenceId(String sequenceId) {
    this.sequenceId = sequenceId;
  }

  
  /**
   * {}
   **/
  public Integer getSequenceValue() {
    return sequenceValue;
  }
  public void setSequenceValue(Integer sequenceValue) {
    this.sequenceValue = sequenceValue;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sequence sequence = (Sequence) o;
    return Objects.equals(sequenceId, sequence.sequenceId) &&
        Objects.equals(sequenceValue, sequence.sequenceValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequenceId, sequenceValue);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sequence {\n");
    
    sb.append("  sequenceId: ").append(sequenceId).append("\n");
    sb.append("  sequenceValue: ").append(sequenceValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

