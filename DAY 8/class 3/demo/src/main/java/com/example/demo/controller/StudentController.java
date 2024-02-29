package com.example.demo.controller;
import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;



@RestController
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService)
    {
        this.studentService=studentService;
    }

    @PostMapping("/student")
    public ResponseEntity<Student> postmet(@RequestBody Student student)
    {
        if(studentService.savemethod(student)==true)
        {
            return new ResponseEntity<>(student,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(student,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @GetMapping("/student/marksGreaterThan/{mark}")
    public ResponseEntity<List<Student>>getPersonsStartsWith(@PathVariable int mark)
    {
       List<Student> k = studentService.GreaterMark(mark);
       if(k.size()==0)
       {
        return new ResponseEntity<>(k,HttpStatus.INTERNAL_SERVER_ERROR);
       }
       return new ResponseEntity<>(k,HttpStatus.OK);
    }

    @GetMapping("/student/marksLessThan/{mark}")
    public ResponseEntity<List<Student>>getPersonsendsWith(@PathVariable int mark)
    {
       List<Student> k = studentService.LesserMark(mark);
       if(k.size()==0)
       {
        return new ResponseEntity<>(k,HttpStatus.INTERNAL_SERVER_ERROR);
       }
       return new ResponseEntity<>(k,HttpStatus.OK);
    }
}





