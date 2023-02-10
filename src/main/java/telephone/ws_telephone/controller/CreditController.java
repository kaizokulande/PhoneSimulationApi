package telephone.ws_telephone.controller;


import java.time.LocalDateTime;

import org.apache.catalina.authenticator.SavedRequest;
import org.hibernate.sql.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import telephone.ws_telephone.model.Argent;
import telephone.ws_telephone.model.Credit;
import telephone.ws_telephone.repository.ArgentRepository;
import telephone.ws_telephone.repository.CreditRepository;

@RestController
@RequestMapping("/api")

public class CreditController {
	@Autowired
	private CreditRepository repository;
	
	@Autowired
	private ArgentRepository argentRepository;
	
	
	public int calccredit(int lastcredit,int creditentered) {
		int newcredit = lastcredit + creditentered;
		return newcredit;
	}
	
	public float calcargent(int creditentered, float lastargent) {
		float newargent = lastargent - creditentered;
		return newargent;
	}
	public int checknumero(String numeroappele)throws Exception {
		char[] charactere = numeroappele.toCharArray();
		Character[] charact = new Character[3];
		charact[0] = new Character(charactere[0]);
		charact[1] = new Character(charactere[1]);
		charact[2] = new Character(charactere[2]);
		String premier = charact[0].toString();
		String deuxieme = charact[1].toString();
		Integer troisiemenombre = Integer.parseInt(charact[2].toString());
		int idoperateur = 0;
		if (premier.compareTo("0")==0 && deuxieme.compareTo("3")==0 ) {
			if(troisiemenombre==3) {
				idoperateur = 3;
			}else if(troisiemenombre==2){
				idoperateur = 2;
			}else if(troisiemenombre==4){
				idoperateur = 1;
			}else {
				throw new Exception("Numero Invalide");
			}
		}else {
			throw new Exception("Numero Invalide");
		}
		return idoperateur;
	}
	
	@CrossOrigin
	@PostMapping("/addcredit")
	public void insertcredit(@RequestBody Credit apicredit)throws Exception {
		int idoperateur = this.checknumero(apicredit.getNumero());
		repository.insertcredit2(apicredit.getNumero(), idoperateur, apicredit.getSolde());
	}
}
