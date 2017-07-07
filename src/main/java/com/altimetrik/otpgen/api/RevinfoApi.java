package com.altimetrik.otpgen.api;

import com.altimetrik.otpgen.models.*;

import com.altimetrik.otpgen.api.service.RevinfoApiService;

import com.altimetrik.otpgen.exception.NotFoundException;

import com.altimetrik.otpgen.models.Revinfo;


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

public class RevinfoApi {

   @Autowired
   private RevinfoApiService service;
  

  @RequestMapping(value = "/revinfo", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Revinfo>> findAllRevinfo()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Revinfo>>(service.findAllRevinfo(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/revinfo", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Revinfo> updateRevinfo(@RequestBody Revinfo revinfo
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Revinfo>(service.updateRevinfo(revinfo), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/revinfo", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Revinfo> addRevinfo(@RequestBody Revinfo revinfo
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Revinfo>(service.addRevinfo(revinfo), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/revinfo/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Revinfo> findByIdRevinfo(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Revinfo>(service.findByIdRevinfo(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/revinfo/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteRevinfo(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteRevinfo(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

