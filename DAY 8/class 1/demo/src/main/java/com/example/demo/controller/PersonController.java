package com.example.demo.controller;



import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RestController
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService)
    {
        this.personService=personService;
    }

    @PostMapping("/person")
    public ResponseEntity<Person> postmet(@RequestBody Person person)
    {
        if(personService.savemethod(person)==true)
        {
            return new ResponseEntity<>(person,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(person,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @GetMapping("/person/startsWithName/{value}")
    public ResponseEntity<List<Person>>getPersonsStartsWith(@PathVariable String value)
    {
       List<Person> k = personService.getPersonsStartsWith(value);
       if(k.size()==0)
       {
        return new ResponseEntity<>(k,HttpStatus.INTERNAL_SERVER_ERROR);
       }
       return new ResponseEntity<>(k,HttpStatus.OK);
    }

    @GetMapping("/person/endsWithName/{value}")
    public ResponseEntity<List<Person>>getPersonsEndsWith(@PathVariable String value)
    {
       List<Person> k = personService.getPersonsEndsWith(value);
       if(k.size()==0)
       {
        return new ResponseEntity<>(k,HttpStatus.INTERNAL_SERVER_ERROR);
       }
       return new ResponseEntity<>(k,HttpStatus.OK);
    }
    
   
}


