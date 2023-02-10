package telephone.ws_telephone.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import telephone.ws_telephone.model.Offre;
import telephone.ws_telephone.repository.OffreRepository;

@RestController
@RequestMapping("/api") 

public class OffreController {
	
	@Autowired
	private OffreRepository offredata;
	
	public OffreController(){
		new Offre();
	}
	@CrossOrigin
	@GetMapping("/offreVendu")
	public int offreVenduuu(){
		int offreeesVendus = offredata.offreVendus();
		return offreeesVendus ;
	}
	
}
