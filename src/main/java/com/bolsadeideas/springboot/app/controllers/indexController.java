package com.bolsadeideas.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
	@GetMapping("/")
	public String hola(Model model) {
		model.addAttribute("mensaje","Hola que tal Spring boot");
		return "hola";
	}
}
