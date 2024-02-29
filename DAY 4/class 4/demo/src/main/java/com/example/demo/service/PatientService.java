package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Patient;
import com.example.demo.repositary.PatientRepo;

@Service
public class PatientService {
    private PatientRepo patientRepo;

    public PatientService(PatientRepo patientRepo)
    {
        this.patientRepo=patientRepo;
    }

    public boolean safe(Patient patient)
    {
        try{
            patientRepo.save(patient);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }

    public List<Patient> showPatients()
    {
        return patientRepo.findAll();
    }

    public Patient showpatientId(int patientId)
    {
        Optional<Patient>k=patientRepo.findById(patientId);
        return k.orElse(null);
    }
}
