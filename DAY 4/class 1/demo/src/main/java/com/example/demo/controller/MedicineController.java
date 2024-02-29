package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Medicine;
import com.example.demo.service.MedicineService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class MedicineController {
    private MedicineService medicineService;

    @Autowired
    public MedicineController(MedicineService medicineService)
    {
        this.medicineService = medicineService;
    }

    @PostMapping("/api/medicine")
    public ResponseEntity postMethodName(@RequestBody Medicine medicine)
     {
        if(medicineService.safe(medicine) == false)
        {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    @GetMapping("/api/medicines")
    public List<Medicine> getMethodName() {
        return medicineService.listofMedicines();
    }
    
    @GetMapping("/api/medicines/{medicineId}")
    public Optional<Medicine> getMethodName1(@PathVariable int medicineId) {
        return medicineService.getallMedicines(medicineId);
    }


}
