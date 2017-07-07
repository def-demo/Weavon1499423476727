package com.altimetrik.otpgen.models.repository;

import com.altimetrik.otpgen.models.*;

import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface OtpDetailsRepository extends JpaRepository<OtpDetails, Integer>{

}



