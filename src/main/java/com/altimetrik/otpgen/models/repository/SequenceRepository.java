package com.altimetrik.otpgen.models.repository;

import com.altimetrik.otpgen.models.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface SequenceRepository extends JpaRepository<Sequence, String>{

}



