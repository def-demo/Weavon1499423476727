package com.altimetrik.otpgen.api.service.impl;

import com.altimetrik.otpgen.api.service.*;
import com.altimetrik.otpgen.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.otpgen.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.otpgen.models.Sequence;


import java.util.List;
import com.altimetrik.otpgen.exception.NotFoundException;


@Service
@Transactional
public class SequenceApiServiceImpl implements SequenceApiService {
		  	  
	  @Autowired
	
  	  private SequenceRepository  sequenceRepository ;
	   
  
  
				
			
      @Override
      public List<Sequence> findAllSequence()
      throws NotFoundException {
      
        
  		
  		
  			return sequenceRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Sequence updateSequence(Sequence sequence)
      throws NotFoundException {
      
         
        	return sequenceRepository.save(sequence);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Sequence addSequence(Sequence sequence)
      throws NotFoundException {
      
         
        	return sequenceRepository.save(sequence);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Sequence findByIdSequence(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return sequenceRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteSequence(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

