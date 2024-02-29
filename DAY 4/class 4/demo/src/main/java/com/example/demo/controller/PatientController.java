package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Patient;
import com.example.demo.service.PatientService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class PatientController {
    private PatientService patientService;

    public PatientController(PatientService patientService)
    {
        this.patientService=patientService;
    }

    @PostMapping("/api/patient")
    public ResponseEntity<Patient> postMethodName(@RequestBody Patient patient) {
        if(patientService.safe(patient)==false)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/api/patients")
    public List<Patient> getMethodName(Patient patient) {
        return patientService.showPatients();
    }

    @GetMapping("/api/patient/{patientId}")
    public Patient getMethodNamee(@PathVariable int patientId) {
        return patientService.showpatientId(patientId);
    }
}
