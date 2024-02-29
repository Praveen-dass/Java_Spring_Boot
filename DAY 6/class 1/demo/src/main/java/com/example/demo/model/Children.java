package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PAGI")
public class Children {
    @Id
    private int babyId;
    private String babyFirstName;
    private String babyLastName;
    private String motherName;
    private String address;
    
    public Children() {
    }
    public Children(int babyId, String babyFirstName, String babyLastName, String motherName, String address) {
        this.babyId = babyId;
        this.babyFirstName = babyFirstName;
        this.babyLastName = babyLastName;
        this.motherName = motherName;
        this.address = address;
    }
    public int getBabyId() {
        return babyId;
    }
    public void setBabyId(int babyId) {
        this.babyId = babyId;
    }
    public String getBabyFirstName() {
        return babyFirstName;
    }
    public void setBabyFirstName(String babyFirstName) {
        this.babyFirstName = babyFirstName;
    }
    public String getBabyLastName() {
        return babyLastName;
    }
    public void setBabyLastName(String babyLastName) {
        this.babyLastName = babyLastName;
    }
    public String getMotherName() {
        return motherName;
    }
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
