package com.example.springdemo.mvc;

public class Student {

	private String firstNname;
	private String lastName;
	private String country;
	
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
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
}
