package com.example.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		// Create student object
		Student theStudent = new Student();
		
		//Add student object into the model
		theModel.addAttribute("student", theStudent);
		
		//Add the country model to the model
		theModel.addAttribute("theCountryOptions", countryOptions);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		//Log student last name
		System.out.println("theStudent: " +  theStudent.getFirstName() + " " + theStudent.getLastName());
		
		return "student-confirmation";
	}
}
