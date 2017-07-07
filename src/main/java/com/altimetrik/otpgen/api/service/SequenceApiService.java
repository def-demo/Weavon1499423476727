package com.altimetrik.otpgen.api.service;

import com.altimetrik.otpgen.models.Sequence;


import com.altimetrik.otpgen.exception.NotFoundException;
import java.util.List;

public interface SequenceApiService {
  
      List<Sequence> findAllSequence()
      throws NotFoundException;
  
      Sequence updateSequence(Sequence sequence)
      throws NotFoundException;
  
      Sequence addSequence(Sequence sequence)
      throws NotFoundException;
  
      Sequence findByIdSequence(String id)
      throws NotFoundException;
  
      void deleteSequence(String id)
      throws NotFoundException;
  
}

