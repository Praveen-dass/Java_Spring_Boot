package com.example.demo.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepo;

@Service
public class PersonService {
    private PersonRepo personRepo;

    public PersonService(PersonRepo personRepo)
    {
        this.personRepo=personRepo;
    }

    public boolean savemethod(Person person)
    {
        try
        {
            personRepo.save(person);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }

    public List<Person> getPersonsStartsWith(String value)
    {
        return personRepo.findByStartName(value);
    }

    public List<Person> getPersonsEndsWith(String value)
    {
        return personRepo.findByEndName(value);
    }
}


