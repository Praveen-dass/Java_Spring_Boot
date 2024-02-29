package com.example.demo.controller;



import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/api/student")
    public ResponseEntity postMethodName(@RequestBody Student children) {

        return studentService.saveChildrenDetail(children);
    }

    @GetMapping("/api/student/sort")
    public List<Student> getMethodName(@RequestParam("pageNo") int pageNo,@RequestParam("pageSize") int pageSize,
                                        @RequestParam("sortBy") String sortBy) {
    
        return studentService.getPageSortList(pageNo, pageSize, sortBy);
    }

    @GetMapping("/api/student")
    public List<Student> getMethodName(@RequestParam("pageNo") int pageNo,@RequestParam("pageSize") int pageSize) {
        return studentService.getPageList(pageNo, pageSize);
    }

}

