package com.webservice.rest.repository;


import com.webservice.rest.entity.Patient;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "http://localhost:4200")

public interface PatientRepository extends CrudRepository<Patient,Integer> {
    public Patient findByName(String name );
    
    
}
