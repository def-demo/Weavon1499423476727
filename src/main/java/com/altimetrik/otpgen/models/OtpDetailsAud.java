package com.altimetrik.otpgen.models;

import com.altimetrik.otpgen.models.Revinfo;
import java.util.Date;

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

public class OtpDetailsAud  {
  
  
   
   
  
  private Integer otpId = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "rev", insertable=false, updatable=false) 
  
  private Revinfo revinfo = null;
  
   
   
  
  private Integer revtype = null;
  
   
   
  
  private String appName = null;
  
   
   
  
  private Integer attempts = null;
  
   
   
  
  private Date createdDate = null;
  
   
   
  
  private Date expiryTime = null;
  
   
   
  
  private String otp = null;
  
   
   
  
  private Integer status = null;
  
   
   
  
  private String userName = null;

  
  /**
   * {}
   **/
  public Integer getOtpId() {
    return otpId;
  }
  public void setOtpId(Integer otpId) {
    this.otpId = otpId;
  }

  
  /**
   * {"foreignKeyColumn":"rev","relation":"OneToOne"}
   **/
  public Revinfo getRevinfo() {
    return revinfo;
  }
  public void setRevinfo(Revinfo revinfo) {
    this.revinfo = revinfo;
  }

  
  /**
   * {}
   **/
  public Integer getRevtype() {
    return revtype;
  }
  public void setRevtype(Integer revtype) {
    this.revtype = revtype;
  }

  
  /**
   * {}
   **/
  public String getAppName() {
    return appName;
  }
  public void setAppName(String appName) {
    this.appName = appName;
  }

  
  /**
   * {}
   **/
  public Integer getAttempts() {
    return attempts;
  }
  public void setAttempts(Integer attempts) {
    this.attempts = attempts;
  }

  
  /**
   * {}
   **/
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   * {}
   **/
  public Date getExpiryTime() {
    return expiryTime;
  }
  public void setExpiryTime(Date expiryTime) {
    this.expiryTime = expiryTime;
  }

  
  /**
   * {}
   **/
  public String getOtp() {
    return otp;
  }
  public void setOtp(String otp) {
    this.otp = otp;
  }

  
  /**
   * {}
   **/
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * {}
   **/
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtpDetailsAud otpDetailsAud = (OtpDetailsAud) o;
    return Objects.equals(otpId, otpDetailsAud.otpId) &&
        Objects.equals(revinfo, otpDetailsAud.revinfo) &&
        Objects.equals(revtype, otpDetailsAud.revtype) &&
        Objects.equals(appName, otpDetailsAud.appName) &&
        Objects.equals(attempts, otpDetailsAud.attempts) &&
        Objects.equals(createdDate, otpDetailsAud.createdDate) &&
        Objects.equals(expiryTime, otpDetailsAud.expiryTime) &&
        Objects.equals(otp, otpDetailsAud.otp) &&
        Objects.equals(status, otpDetailsAud.status) &&
        Objects.equals(userName, otpDetailsAud.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otpId, revinfo, revtype, appName, attempts, createdDate, expiryTime, otp, status, userName);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtpDetailsAud {\n");
    
    sb.append("  otpId: ").append(otpId).append("\n");
    sb.append("  revinfo: ").append(revinfo).append("\n");
    sb.append("  revtype: ").append(revtype).append("\n");
    sb.append("  appName: ").append(appName).append("\n");
    sb.append("  attempts: ").append(attempts).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  expiryTime: ").append(expiryTime).append("\n");
    sb.append("  otp: ").append(otp).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

