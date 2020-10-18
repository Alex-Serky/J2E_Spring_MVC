package com.projet.liste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.projet.web.ValidPassword;

@Controller
public class ListeController {
	
	@Autowired
	ListeAFaireService listeAFaireService;

	@RequestMapping(value = "/liste", method = RequestMethod.GET)
	public String MaListeDesTaches(@RequestParam String prenom, Model model) {
		
		model.addAttribute("prenom", prenom);
		model.addAttribute("liste", listeAFaireService.recupererListe("Mes élèves"));
		
		return "liste";
	}
	
}