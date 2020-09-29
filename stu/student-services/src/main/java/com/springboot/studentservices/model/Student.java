package com.springboot.studentservices.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
	private long rollId;
	private String name;
	private int age;
	private List<Courses> coursesEnrolled;
	
	
	public Student() {
		this.rollId=0;
		this.name="null";
		this.age=0;
		Courses c=new Courses();
		this.coursesEnrolled= Arrays.asList(c);
	}	
	
	public Student(int rollId,String name, int age, List<Courses> courses ){
		this.rollId=rollId;
		this.name=name;
		this.age=age;
		this.coursesEnrolled=courses;
	}
	
	public long getRollId() {
		return rollId;
	}

	public void setRollId(long rollId) {
		this.rollId = rollId;
	}

	public String getName() {
		return name;
	}

	public List<Courses> getCoursesEnrolled() {
		return coursesEnrolled;
	}

	public void setCoursesEnrolled(List<Courses> coursesEnrolled) {
		this.coursesEnrolled = coursesEnrolled;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
