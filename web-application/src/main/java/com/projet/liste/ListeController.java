package com.projet.liste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("prenom")
public class ListeController {
	
	@Autowired
	ListeAFaireService listeAFaireService;

	@RequestMapping(value = "/liste", method = RequestMethod.GET)
	public String MaListeDesTaches(Model model) {

		model.addAttribute("liste", listeAFaireService.recupererListe("Mes élèves"));
		
		return "liste";
	}
	
}