package com.altimetrik.otpgen.models;

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

public class OtpDetails  {
  
  
   
  
  @Id
   
  
  private Integer otpId = null;
  
   
   
  
  private String appName = null;
  
   
   
  
  private Integer attempts = null;
  
   
   
  
  private Date createdDate = null;
  
   
   
  
  private Date expiryTime = null;
  
   
   
  
  private String otp = null;
  
   
   
  
  private Integer status = null;
  
   
   
  
  private String userName = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Integer getOtpId() {
    return otpId;
  }
  public void setOtpId(Integer otpId) {
    this.otpId = otpId;
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
    OtpDetails otpDetails = (OtpDetails) o;
    return Objects.equals(otpId, otpDetails.otpId) &&
        Objects.equals(appName, otpDetails.appName) &&
        Objects.equals(attempts, otpDetails.attempts) &&
        Objects.equals(createdDate, otpDetails.createdDate) &&
        Objects.equals(expiryTime, otpDetails.expiryTime) &&
        Objects.equals(otp, otpDetails.otp) &&
        Objects.equals(status, otpDetails.status) &&
        Objects.equals(userName, otpDetails.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otpId, appName, attempts, createdDate, expiryTime, otp, status, userName);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtpDetails {\n");
    
    sb.append("  otpId: ").append(otpId).append("\n");
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

