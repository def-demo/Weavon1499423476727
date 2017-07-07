package com.altimetrik.otpgen.api.service.impl;

import com.altimetrik.otpgen.api.service.*;
import com.altimetrik.otpgen.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.otpgen.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.otpgen.models.OtpDetails;


import java.util.List;
import com.altimetrik.otpgen.exception.NotFoundException;


@Service
@Transactional
public class OtpDetailsApiServiceImpl implements OtpDetailsApiService {
		  	  
	  @Autowired
	
  	  private OtpDetailsRepository  otpDetailsRepository ;
	   
  
  
				
			
      @Override
      public List<OtpDetails> findAllOtpDetails()
      throws NotFoundException {
      
        
  		
  		
  			return otpDetailsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public OtpDetails updateOtpDetails(OtpDetails otpDetails)
      throws NotFoundException {
      
         
        	return otpDetailsRepository.save(otpDetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public OtpDetails addOtpDetails(OtpDetails otpDetails)
      throws NotFoundException {
      
         
        	return otpDetailsRepository.save(otpDetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public OtpDetails findByIdOtpDetails(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return otpDetailsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteOtpDetails(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

