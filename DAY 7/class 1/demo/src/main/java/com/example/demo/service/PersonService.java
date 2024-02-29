package com.example.demo.service;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepo;

@Service
public class PersonService {
   
    private PersonRepo personRepo;

    private PersonService(PersonRepo personRepo)
    {
        this.personRepo=personRepo;
    }

    public ResponseEntity postall(Person person)
    {
        Person p = new Person();
        try{
            p = personRepo.save(person);
            return new ResponseEntity<>(p,HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(p,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public List<Person> getall()
    {
        return personRepo.findAll();
    }

    public List<Person> getbyage(int byAge)
    {
        return personRepo.findByAge(byAge);
        
    }


}
