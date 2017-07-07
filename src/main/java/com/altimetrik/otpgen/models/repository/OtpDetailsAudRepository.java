package com.altimetrik.otpgen.models.repository;

import com.altimetrik.otpgen.models.*;

import com.altimetrik.otpgen.models.Revinfo;
import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface OtpDetailsAudRepository extends JpaRepository<OtpDetailsAud, Long>{

}



