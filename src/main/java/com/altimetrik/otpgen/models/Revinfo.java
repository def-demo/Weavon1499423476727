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

public class Revinfo  {
  
  
   
  
  @Id
   
  
  private Integer rev = null;
  
   
   
  
  private Long revtstmp = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Integer getRev() {
    return rev;
  }
  public void setRev(Integer rev) {
    this.rev = rev;
  }

  
  /**
   * {}
   **/
  public Long getRevtstmp() {
    return revtstmp;
  }
  public void setRevtstmp(Long revtstmp) {
    this.revtstmp = revtstmp;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Revinfo revinfo = (Revinfo) o;
    return Objects.equals(rev, revinfo.rev) &&
        Objects.equals(revtstmp, revinfo.revtstmp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rev, revtstmp);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Revinfo {\n");
    
    sb.append("  rev: ").append(rev).append("\n");
    sb.append("  revtstmp: ").append(revtstmp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

