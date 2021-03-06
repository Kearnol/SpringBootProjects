package com.dk.omikuji.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/omikuji")
public class MainController {
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/fortune")
	public String fortune(
		HttpSession session,
		@RequestParam(value="number") String number,
		@RequestParam(value="city") String city,
		@RequestParam(value="person") String person,
		@RequestParam(value="endeavor") String endeavor,
		@RequestParam(value="thing") String thing,
		@RequestParam(value="nicety") String nicety
		) {
		
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("endeavor", endeavor);
		session.setAttribute("thing", thing);
		session.setAttribute("nicety", nicety);
		
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping("/show")
	public String show(HttpSession session, Model model) {
		model.addAttribute("name", session.getAttribute("name"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("person",session.getAttribute("person"));
		model.addAttribute("endeavor",session.getAttribute("endeavor"));
		model.addAttribute("thing", session.getAttribute("thing"));
		model.addAttribute("nicety",session.getAttribute("nicety"));
		
		return "show.jsp";
	}

}
