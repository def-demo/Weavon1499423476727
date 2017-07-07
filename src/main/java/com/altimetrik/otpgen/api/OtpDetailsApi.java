package com.altimetrik.otpgen.api;

import com.altimetrik.otpgen.models.*;

import com.altimetrik.otpgen.api.service.OtpDetailsApiService;

import com.altimetrik.otpgen.exception.NotFoundException;

import com.altimetrik.otpgen.models.OtpDetails;


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

public class OtpDetailsApi {

   @Autowired
   private OtpDetailsApiService service;
  

  @RequestMapping(value = "/otp_details", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<OtpDetails>> findAllOtpDetails()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<OtpDetails>>(service.findAllOtpDetails(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/otp_details", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< OtpDetails> updateOtpDetails(@RequestBody OtpDetails otpDetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<OtpDetails>(service.updateOtpDetails(otpDetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/otp_details", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< OtpDetails> addOtpDetails(@RequestBody OtpDetails otpDetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<OtpDetails>(service.addOtpDetails(otpDetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/otp_details/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< OtpDetails> findByIdOtpDetails(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<OtpDetails>(service.findByIdOtpDetails(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/otp_details/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteOtpDetails(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteOtpDetails(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

