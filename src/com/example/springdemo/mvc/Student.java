package com.example.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstNname;
	private String lastName;
	private String country;
	
	private LinkedHashMap<String, String> countryOptions = new LinkedHashMap<>();
	
	public Student() {
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("CM" , "Cameroon");
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
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
}
