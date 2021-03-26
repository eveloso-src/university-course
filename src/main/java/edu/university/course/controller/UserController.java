package edu.university.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/")
	public String viewHomePage(Model model) {
		System.out.println("log");
		return "index";
	}
}
