package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.student;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class studentController {

    @GetMapping("/student")
    public student getMethodName() {
        student k = new student(1L, "John Doe", "This is a student description");
        return k;
    }
}
