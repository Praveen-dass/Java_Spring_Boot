package com.example.demo.service;


import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
    private StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo)
    {
        this.studentRepo=studentRepo;
    }

    public boolean savemethod(Student student)
    {
        try
        {
            studentRepo.save(student);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }

    public List<Student> GreaterMark(int mark)
    {
        return studentRepo.findByGreaterMark(mark);
    }

    public List<Student> LesserMark(int mark)
    {
        return studentRepo.findByLesserMark(mark);
    }
}






