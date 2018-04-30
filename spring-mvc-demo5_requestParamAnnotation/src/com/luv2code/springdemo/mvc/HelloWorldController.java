package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new a controller method to read form data and 
	// add data to the model
	@RequestMapping("/processFormVersion2")
	public String letsShoutDude(HttpServletRequest request,
			Model model) {
		//read the request parameter from HTML form
		String theName = request.getParameter("studentName");
		//convert data to all caps
		theName = theName.toUpperCase();
		//create the message
		String result = "Yo! " + theName;
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
/*****************************************************/
	@RequestMapping("/processFormVersion3")
	public String processFormVersion3(
			@RequestParam("studentName") String theName,
			Model model) {
		//read the request parameter from HTML form
// czyli teraz to juz nie jest potrzebne:
//		String theName = request.getParameter("studentName");
		//convert data to all caps
		theName = theName.toUpperCase();
		//create the message
		String result = "Hey My Friend from V3! " + theName;
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
	
	
	
	
	
	
}