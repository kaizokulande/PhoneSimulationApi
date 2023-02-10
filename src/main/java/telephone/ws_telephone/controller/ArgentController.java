package telephone.ws_telephone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import telephone.ws_telephone.model.Argent;
import telephone.ws_telephone.repository.ArgentRepository;

@RestController
@RequestMapping("/api")

public class ArgentController {

	
	@Autowired
	private ArgentRepository argentdata;
	
	public ArgentController(){
		new Argent();
	}
	@CrossOrigin
	@GetMapping("/sommeSolde")
	public float findClientByNumero(){
		float sommeDeToutLesSoldes = argentdata.sommeSolde();
		return sommeDeToutLesSoldes ;
	}
	@CrossOrigin
	@GetMapping("/compte1Client")
	public Argent getCompteDunClient(@RequestParam String numero) {
		Argent argent = argentdata.compte1Client(numero);
		return argent;
	}
}
