package com.projet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/")
	public String pageAccueil() {
		return "accueil";
	}
	
	@RequestMapping(value ="/", method = RequestMethod.POST)
	public String PostMethod(@RequestParam String prenom, @RequestParam String password, Model model) {
		model.addAttribute("prenom", prenom);
		model.addAttribute("password", password);
		
		return "bienvenue";
	}

}