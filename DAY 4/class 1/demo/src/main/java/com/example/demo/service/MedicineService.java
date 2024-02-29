package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Medicine;
import com.example.demo.repository.MedicineRepo;

@Service
public class MedicineService {
    private MedicineRepo medicineRepo;

    @Autowired
    public MedicineService(MedicineRepo medicineRepo)
    {
        this.medicineRepo=medicineRepo;
    }

    public boolean safe(Medicine medicine)
    {
        try{
             medicineRepo.save(medicine);
        }
        catch(Exception e)
        {
            System.out.println("Exception");
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public List<Medicine>listofMedicines()
    {
        return medicineRepo.findAll();
    }

    public Optional<Medicine>getallMedicines(int id)
    {
        return medicineRepo.findById(id);
    }

}
