package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService)
    {
        this.personService=personService;
    }

    @PostMapping("/api/person")
    public ResponseEntity postMethodName(@RequestBody Person person) {
        return personService.postall(person);    
    }

    @GetMapping("/api/person")
    public List<Person> getMethodName() {
        return personService.getall();
    }

    @GetMapping("/api/person/byAge")
    public List<Person> getMethodName(@RequestParam("byAge") int byAge) {
        return personService.getbyage(byAge);
    }    
}
