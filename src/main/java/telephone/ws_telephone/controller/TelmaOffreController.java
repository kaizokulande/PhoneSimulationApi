package telephone.ws_telephone.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import telephone.ws_telephone.model.Telma_offre;
import telephone.ws_telephone.repository.TelmaOffreRepository;
@RestController
@RequestMapping("/api")
public class TelmaOffreController {
	@Autowired
	private TelmaOffreRepository telmadata;
	public TelmaOffreController(){
		new Telma_offre();
	}
	@CrossOrigin
	@GetMapping("/listesOffres")
		public List<Telma_offre> listesOffres(){
			return telmadata.getAllTelmaOffre();
	}
	@CrossOrigin
	@PostMapping("/creationOffre")
	public String creationOffreTelma(@RequestParam(value="nameTelmaOffre") String nameTelmaOffre,@RequestParam(value="prixtelmaOffre") int prixTelmaOffre){
		if(nameTelmaOffre!="" && prixTelmaOffre>100) {
			telmadata.creationOffre(nameTelmaOffre,prixTelmaOffre); 
			return "truee";
		}else {
			return "value not accepted ";
		}		
	}		
	@CrossOrigin
	@DeleteMapping("/deleteOffre/{name_telma_offre}")
	public String deleteOffre(@PathVariable(value="name_telma_offre") String name_telma_offre){
		telmadata.deleteOffre(name_telma_offre);
		return "OFFRE Deleted";
	}
	
}	