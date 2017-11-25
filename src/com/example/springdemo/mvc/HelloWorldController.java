package com.example.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//Add new method to read HTML form attribute
	// and add it to a model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		
		//Convert the data to all caps
		theName = theName.toUpperCase();
		
		String result = "Yo: " + theName;
		
		//Adding theName to model object
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
