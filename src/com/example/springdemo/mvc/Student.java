package com.example.springdemo.mvc;

public class Student {

	private String firstNname;
	private String lastName;
	
	public Student() {
		
	}
	
	public void setFirstName(String firstNname) {
		this.firstNname = firstNname;
	}
	
	public String getFirstName() {
		return firstNname;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
}
