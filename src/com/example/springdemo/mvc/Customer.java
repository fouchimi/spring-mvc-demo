package com.example.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Customer {

	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	@Min(value=0, message="Must be greater or equal to zero")
	@Max(value=10, message="Must be lesser or equal to ten")
	private int freePasses;
	
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
	
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	
	public int getFreePasses() {
		return freePasses;
	}
}
