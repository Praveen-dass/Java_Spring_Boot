package com.example.demo.service;



import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;


@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public ResponseEntity saveChildrenDetail(Student children) {

        Student c = new Student();
        try {
            c = studentRepo.save(children);
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(c, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public List<Student> getSortedList(String field) {

        return studentRepo.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    public List<Student> getPageList(int offset,int size){
 
        Page<Student> p = studentRepo.findAll(PageRequest.of(offset,size));
        return p.getContent();
    }
    
    public List<Student> getPageSortList(int offset,int size,String field){
        
        Page<Student> p =  studentRepo.findAll(PageRequest.of(offset,size,Sort.Direction.DESC,field));
        return p.getContent();
    }
}

