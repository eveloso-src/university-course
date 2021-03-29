package edu.university.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/")
	public String viewHomePage(Model model) {
		System.out.println("log");
		model.addAttribute("lista", "lista");
		return "index";
	}

	@GetMapping("/postulacion")
	public String postulacion(Model model) {
		// consultar postulaciones de ese usuario en la base de datos
		return "postulacion";
	}

}
