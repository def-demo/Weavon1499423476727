package com.altimetrik.otpgen.api.service.impl;

import com.altimetrik.otpgen.api.service.*;
import com.altimetrik.otpgen.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.otpgen.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.otpgen.models.OtpDetailsAud;


import java.util.List;
import com.altimetrik.otpgen.exception.NotFoundException;


@Service
@Transactional
public class OtpDetailsAudApiServiceImpl implements OtpDetailsAudApiService {
		  	  
	  @Autowired
	
  	  private OtpDetailsAudRepository  otpDetailsAudRepository ;
	   
  
  
				
			
      @Override
      public List<OtpDetailsAud> findAllOtpDetailsAud()
      throws NotFoundException {
      
        
  		
  		
  			return otpDetailsAudRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public OtpDetailsAud updateOtpDetailsAud(OtpDetailsAud otpDetailsAud)
      throws NotFoundException {
      
         
        	return otpDetailsAudRepository.save(otpDetailsAud);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public OtpDetailsAud addOtpDetailsAud(OtpDetailsAud otpDetailsAud)
      throws NotFoundException {
      
         
        	return otpDetailsAudRepository.save(otpDetailsAud);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public OtpDetailsAud findByIdOtpDetailsAud(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return otpDetailsAudRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteOtpDetailsAud(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

