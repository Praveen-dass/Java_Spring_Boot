package com.example.demo.service;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepo;

@Service
public class CourseService {

    private CourseRepo courseRepo;

    private CourseService(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    public ResponseEntity postall(Course course) {
        Course p = new Course();
        try {
            p = courseRepo.save(course);
            return new ResponseEntity<>(p, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(p, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public List<Course> getall() {
        return courseRepo.findAll();
    }

    public List<Course> getbyage(String courseName) {
        return courseRepo.findByCourseName(courseName);
    }
}
