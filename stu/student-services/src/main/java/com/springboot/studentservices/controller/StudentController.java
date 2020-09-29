package com.springboot.studentservices.controller;

import com.springboot.studentservices.ServiceClass;
import com.springboot.studentservices.model.Courses;
import com.springboot.studentservices.model.Student;

import java.util.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class StudentController {
	
	@Autowired
	private ServiceClass ServiceClass;
	
	 @GetMapping("/courses")
	 @ResponseBody
	 public List<Courses> getCourses() {
		 return this.ServiceClass.getCourses();
	 }
	 
	 @GetMapping("/course/{id}")
	 @ResponseBody
	 public Courses getCourseById(@PathVariable int id) {
		 return this.ServiceClass.getCourseById(id);
	 }	
	 
	 @GetMapping("/students")
	 @ResponseBody
	 public List<Student> getStudent() {
		 return this.ServiceClass.getStudent();
	 }
	 
	 @GetMapping("/student/{name}")
	 @ResponseBody
	 public Student getStudentByName(@PathVariable String name) {
		 return this.ServiceClass.getStudentByName(name);
	 }
	 
	 @PostMapping("/student/add")
	 public String addStudent(@RequestBody Student s) {
		 this.ServiceClass.addStudent(s);
		 return "student added";
	 }
	 
}
