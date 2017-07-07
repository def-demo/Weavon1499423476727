package com.altimetrik.otpgen.api.service;

import com.altimetrik.otpgen.models.OtpDetails;


import com.altimetrik.otpgen.exception.NotFoundException;
import java.util.List;

public interface OtpDetailsApiService {
  
      List<OtpDetails> findAllOtpDetails()
      throws NotFoundException;
  
      OtpDetails updateOtpDetails(OtpDetails otpDetails)
      throws NotFoundException;
  
      OtpDetails addOtpDetails(OtpDetails otpDetails)
      throws NotFoundException;
  
      OtpDetails findByIdOtpDetails(Integer id)
      throws NotFoundException;
  
      void deleteOtpDetails(Integer id)
      throws NotFoundException;
  
}

