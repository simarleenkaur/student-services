package com.springboot.studentservices.model;

public class Courses {
	private int Id;
	private String name;
	private int rating;
	private String description;
	
	
	public Courses(){
		this.Id=0;
		this.name="null";
		this.rating=0;
		this.description="null";
	}
	
	public Courses(int Id, String name, int rating, String description){
		super();
		this.Id=Id;
		this.name=name;
		this.rating=rating;
		this.description=description;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}	
}
