package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class student {
    private String name;
    private int id;

    public student()
    {
    }

    public student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}
