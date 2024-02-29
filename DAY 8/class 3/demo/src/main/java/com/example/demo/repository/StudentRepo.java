package com.example.demo.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{
    @Query("SELECT k FROM Student k where k.marks > ?1")
    List<Student>findByGreaterMark(int mark);
    @Query("SELECT k FROM Student k where k.marks < ?1")
    List<Student>findByLesserMark(int mark);
} 





