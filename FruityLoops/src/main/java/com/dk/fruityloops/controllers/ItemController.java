package com.dk.fruityloops.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dk.fruityloops.models.Item;

@Controller
public class ItemController {
 
 @RequestMapping("/")
 public String index(Model model) {
     
     ArrayList<Item> fruits = new ArrayList<Item>();
     fruits.add(new Item("Kiwi", 1.5));
     fruits.add(new Item("Mango", 2.0));
     fruits.add(new Item("Goji Berries", 4.0));
     fruits.add(new Item("Guava", .75));
     
     for(Item fruit : fruits) {
    	 model.addAttribute("fruits", fruits);
     }
     return "index.jsp";
 }
 
 @RequestMapping("/counter")
 public String counter(HttpSession session, Model model) {
	 if(session.getAttribute("count") == null) {
		 session.setAttribute("count", 0);
		 int counter = (int) session.getAttribute("count");
		 model.addAttribute("count", counter);
	 }else {
		 int counter = (int) session.getAttribute("count");
		 counter++;
		 session.setAttribute("count", counter);
		 model.addAttribute("count", (Object) counter);
	 }
	 return "counter.jsp";
 }


 @RequestMapping("/reset")
 public String reset(HttpSession session) {
	 session.setAttribute("count", 0);
	 return "redirect:/counter";
 }
 
 @RequestMapping("/addtwo")
 public String addTwo(HttpSession session) {
	 int counter = (int) session.getAttribute("count");
	 counter += 1;
	 session.setAttribute("count", counter);
	 return "redirect:/counter";
 }

}


