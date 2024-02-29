package com.example.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer>{
    @Query("SELECT k FROM Person k where k.name like ?1%")
    List<Person>findByStartName(String value);
    @Query("SELECT k FROM Person k where k.name like %?1")
    List<Person>findByEndName(String value);
} 

