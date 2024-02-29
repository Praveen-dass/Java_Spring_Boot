package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class CourseController {
    private CourseService courseService;

    public CourseController(CourseService courseService)
    {
        this.courseService=courseService;
    }

    @PostMapping("/api/course")
    public ResponseEntity postMethodName(@RequestBody Course course) {
        return courseService.postall(course);
    }

    @GetMapping("/api/course")
    public List<Course> getMethodName() {
        return courseService.getall();
    }

    @GetMapping("/api/course/{courseName}")
    public List<Course> getMethodName(@PathVariable("courseName") String courseName) {
        return courseService.getbyage(courseName);
    }
}
