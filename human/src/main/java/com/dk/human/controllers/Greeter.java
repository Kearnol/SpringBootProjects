package com.dk.human.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeter {

	@RequestMapping("")
	public String index(
			@RequestParam(value="name", defaultValue="Human") String name,
			@RequestParam(value="lname", required=false) String last_name,
			@RequestParam(value="m", required=false, defaultValue="1") String mult
			) {
		int i = Integer.parseInt(mult);
		String result ="";
		String finalResult = "";
			if (last_name == null) {
				 result = String.format("Welcome to the site %s%n", name);
			}else {
				 result = "Welcome to the site " + name + " " + last_name;
			}
			for(int j = 0; j < i; j++) {
				finalResult += result;
			}			
			return finalResult;
		}
	}
