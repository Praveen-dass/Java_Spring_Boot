package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Integer>{

    
} 
