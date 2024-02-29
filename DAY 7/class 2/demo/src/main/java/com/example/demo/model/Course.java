package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private int courseId;
    private String courseName;
    private int creditHours;
    private String instructor;
    private String preRequisties;
    private int maxCapacity;
    private String enrolledStudents;
    
    public Course() {
    }
    public Course(int courseId, String courseName, int creditHours, String instructor, String preRequisties,
            int maxCapacity, String enrolledStudents) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.instructor = instructor;
        this.preRequisties = preRequisties;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = enrolledStudents;
    }
    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getCreditHours() {
        return creditHours;
    }
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public String getPreRequisties() {
        return preRequisties;
    }
    public void setPreRequisties(String preRequisties) {
        this.preRequisties = preRequisties;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    public String getEnrolledStudents() {
        return enrolledStudents;
    }
    public void setEnrolledStudents(String enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
