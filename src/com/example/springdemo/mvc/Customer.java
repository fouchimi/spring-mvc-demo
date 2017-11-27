package com.example.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.example.springdemo.mvc.validation.CourseCode;


public class Customer {

	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=0, message="Must be greater or equal to zero")
	@Max(value=10, message="Must be lesser or equal to ten")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="Only 5 digits or chars")
	private String postalCode;
	
	@CourseCode(value="LUV", message="must start with LUV")
	private String courseCode;
	
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
	
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
	public Integer getFreePasses() {
		return freePasses;
	}
	
	public void setPostalCode(String postCalCode) {
		this.postalCode = postCalCode;
	}
	
	public String getPostalCode() {
		return postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

}
