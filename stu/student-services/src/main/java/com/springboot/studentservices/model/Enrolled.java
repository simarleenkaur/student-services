package com.springboot.studentservices.model;

import java.util.List;

public class Enrolled {
	private String name;
	private List<String> coursesEnrolled;
	
	public Enrolled(String name, List<String> coursesEnrolled) {
		super();
		this.name = name;
		this.coursesEnrolled = coursesEnrolled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCoursesEnrolled() {
		return coursesEnrolled;
	}

	public void setCoursesEnrolled(List<String> coursesEnrolled) {
		this.coursesEnrolled = coursesEnrolled;
	}
	
	
}
