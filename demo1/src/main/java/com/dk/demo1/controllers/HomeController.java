package com.dk.demo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HomeController {

	@RequestMapping("")
	public String hello(Model model) {
		model.addAttribute("dojoName", "Devin");
		return "index.jsp";
	}
	
	@RequestMapping("/world")
	public String myRoute() {
		return "Class level annotations are cool too"; 
	}
	
	// using parameters in the URI 
	@RequestMapping("/greeting")
		public String greet(
				@RequestParam(value="name", required=false, defaultValue="Defaulty Face") String name,
				@RequestParam(value="age") String age, 
				@RequestParam(value="pet") String pet){
			return "Hello, " + name + "! You are " + age + " years old and your pet is: " + pet;
	}
	
	
	// using path variables in the URI
	@RequestMapping("/{name}/{age}/{pet}")
	public String greeting(
			@PathVariable("name") String name,
			@PathVariable("age") Integer age,
			@PathVariable("pet") String pet) {
		if (age < 18) {
			return "Sorry, must be 18 to see this page! ";
		}
		return "Hello, " + name + "! Congratulations, you did this using params!!! You are " + age + " years old and your pet is: " + pet;
	}
	
}
