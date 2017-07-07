package com.altimetrik.otpgen.api.service.impl;

import com.altimetrik.otpgen.api.service.*;
import com.altimetrik.otpgen.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.otpgen.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.otpgen.models.Revinfo;


import java.util.List;
import com.altimetrik.otpgen.exception.NotFoundException;


@Service
@Transactional
public class RevinfoApiServiceImpl implements RevinfoApiService {
		  	  
	  @Autowired
	
  	  private RevinfoRepository  revinfoRepository ;
	   
  
  
				
			
      @Override
      public List<Revinfo> findAllRevinfo()
      throws NotFoundException {
      
        
  		
  		
  			return revinfoRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Revinfo updateRevinfo(Revinfo revinfo)
      throws NotFoundException {
      
         
        	return revinfoRepository.save(revinfo);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Revinfo addRevinfo(Revinfo revinfo)
      throws NotFoundException {
      
         
        	return revinfoRepository.save(revinfo);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Revinfo findByIdRevinfo(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return revinfoRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteRevinfo(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

