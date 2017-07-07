package com.altimetrik.otpgen.api.service;

import com.altimetrik.otpgen.models.OtpDetailsAud;


import com.altimetrik.otpgen.exception.NotFoundException;
import java.util.List;

public interface OtpDetailsAudApiService {
  
      List<OtpDetailsAud> findAllOtpDetailsAud()
      throws NotFoundException;
  
      OtpDetailsAud updateOtpDetailsAud(OtpDetailsAud otpDetailsAud)
      throws NotFoundException;
  
      OtpDetailsAud addOtpDetailsAud(OtpDetailsAud otpDetailsAud)
      throws NotFoundException;
  
      OtpDetailsAud findByIdOtpDetailsAud(Integer id)
      throws NotFoundException;
  
      void deleteOtpDetailsAud(Integer id)
      throws NotFoundException;
  
}

