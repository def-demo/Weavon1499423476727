package com.altimetrik.otpgen.api;

import com.altimetrik.otpgen.models.*;

import com.altimetrik.otpgen.api.service.SequenceApiService;

import com.altimetrik.otpgen.exception.NotFoundException;

import com.altimetrik.otpgen.models.Sequence;


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

public class SequenceApi {

   @Autowired
   private SequenceApiService service;
  

  @RequestMapping(value = "/sequence", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Sequence>> findAllSequence()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Sequence>>(service.findAllSequence(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/sequence", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Sequence> updateSequence(@RequestBody Sequence sequence
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Sequence>(service.updateSequence(sequence), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/sequence", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Sequence> addSequence(@RequestBody Sequence sequence
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Sequence>(service.addSequence(sequence), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/sequence/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Sequence> findByIdSequence(@PathVariable("id") String id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Sequence>(service.findByIdSequence(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/sequence/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteSequence(@PathVariable("id") String id
)
      throws NotFoundException {
        
       	  service.deleteSequence(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

