package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class studentcontroller {

    @Autowired
    public student k;

    @GetMapping("/path")

    public student getMethodName() {
        return new student("dass",18);
    }

    @PostMapping("/path1")
    public student postMethodName(@RequestBody student entity) {
        k.setName(entity.getName());
        k.setId(entity.getId());
        return entity;
    }
}
