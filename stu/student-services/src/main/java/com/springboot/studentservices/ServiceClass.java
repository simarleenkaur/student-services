package com.springboot.studentservices;

import com.springboot.studentservices.model.Courses;
import com.springboot.studentservices.model.Student;

import java.util.List;

public interface ServiceClass {
	 public List<Courses> getCourses();
	 public Courses getCourseById(int id);
	 //public Courses getCourseByName(String name);
	 public List<Student> getStudent();
	 public Student getStudentByName(String name); 
	 public void addStudent(Student s);
}
