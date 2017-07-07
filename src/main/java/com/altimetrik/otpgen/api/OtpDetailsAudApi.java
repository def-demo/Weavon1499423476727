package com.altimetrik.otpgen.api;

import com.altimetrik.otpgen.models.*;

import com.altimetrik.otpgen.api.service.OtpDetailsAudApiService;

import com.altimetrik.otpgen.exception.NotFoundException;

import com.altimetrik.otpgen.models.OtpDetailsAud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/api" )

public class OtpDetailsAudApi {

   @Autowired
   private OtpDetailsAudApiService service;
  

  @RequestMapping(value = "/otp_details_aud", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<OtpDetailsAud>> findAllOtpDetailsAud()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<OtpDetailsAud>>(service.findAllOtpDetailsAud(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/otp_details_aud", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< OtpDetailsAud> updateOtpDetailsAud(@RequestBody OtpDetailsAud otpDetailsAud
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<OtpDetailsAud>(service.updateOtpDetailsAud(otpDetailsAud), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/otp_details_aud", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< OtpDetailsAud> addOtpDetailsAud(@RequestBody OtpDetailsAud otpDetailsAud
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<OtpDetailsAud>(service.addOtpDetailsAud(otpDetailsAud), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/otp_details_aud/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< OtpDetailsAud> findByIdOtpDetailsAud(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<OtpDetailsAud>(service.findByIdOtpDetailsAud(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/otp_details_aud/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteOtpDetailsAud(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteOtpDetailsAud(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

