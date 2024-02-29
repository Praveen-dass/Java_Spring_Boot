package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int id;

    private String name, city, rollno;
    private int age;

    public Student() {
    }

    public Student(int id, String name, String city, String rollnom, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.rollno = rollnom;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollnom) {
        this.rollno = rollnom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

}

