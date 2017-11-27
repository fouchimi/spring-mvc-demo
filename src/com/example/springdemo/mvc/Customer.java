package com.example.springdemo.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Customer {

	private String firstName;
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	public Customer() {
		
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
}
