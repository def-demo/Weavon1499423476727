package com.altimetrik.otpgen.api.service;

import com.altimetrik.otpgen.models.Revinfo;


import com.altimetrik.otpgen.exception.NotFoundException;
import java.util.List;

public interface RevinfoApiService {
  
      List<Revinfo> findAllRevinfo()
      throws NotFoundException;
  
      Revinfo updateRevinfo(Revinfo revinfo)
      throws NotFoundException;
  
      Revinfo addRevinfo(Revinfo revinfo)
      throws NotFoundException;
  
      Revinfo findByIdRevinfo(Integer id)
      throws NotFoundException;
  
      void deleteRevinfo(Integer id)
      throws NotFoundException;
  
}

