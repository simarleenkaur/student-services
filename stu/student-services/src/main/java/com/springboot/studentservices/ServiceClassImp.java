package com.springboot.studentservices;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.springboot.studentservices.model.Courses;
import com.springboot.studentservices.model.Enrolled;
import com.springboot.studentservices.model.Student;

@Service
public class ServiceClassImp implements ServiceClass{

	List <Courses> CourseList;
	List <Student> StudentList;
	List <Enrolled> mapEnrollment;
	
	ServiceClassImp() {
		CourseList=new ArrayList<>();
		Courses c1,c2,c3,c4;
		c1=new Courses(101,"Java",3,"in depth knowledge of java with examples");
		c2=new Courses(102,"Python",5,"basic python concepts");
		c3=new Courses(103,"Angular",4,"front-end with angular");
		c4=new Courses(104,"Spring",5,"build easy web apis with spring");
		CourseList.add(c1);
		CourseList.add(c2);
		CourseList.add(c3);
		CourseList.add(c4);
		
		StudentList=new ArrayList<>();
	    StudentList.add(new Student(1,"Simar",22,Arrays.asList(c1,c2)));
	    StudentList.add(new Student(2,"harsh",22,Arrays.asList(c3,c4)));
	    
	}
	
	@Override
	public List<Courses> getCourses() {
		return CourseList;
	}

	@Override
	public Courses getCourseById(int id) {
		Courses course=null;
		for(Courses c:CourseList) {
			if( c.getId()==id) {
				course=c;
				break;
			}
		}
		return course;
	}

	@Override
	public List<Student> getStudent() {
		return StudentList;
	}

	@Override
	public Student getStudentByName(String name) {
		Student student=null;
		for(Student s: StudentList) {
			if(s.getName().equalsIgnoreCase(name)) {
				student=s;
				break;
			}
		}
		return student;
	}

	@Override
	public void addStudent(Student s) {
		StudentList.add(s);		
	}

}
