package telephone.ws_telephone.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import telephone.ws_telephone.model.Cout;
import telephone.ws_telephone.model.Transactionns;
import telephone.ws_telephone.repository.CoutRepository;
import telephone.ws_telephone.repository.TransactionRepository;
@RestController
@RequestMapping("/api")

public class TransactionController {
	@Autowired
	private TransactionRepository transactionData;
	@Autowired 
	private CoutRepository coutRepos;
	public TransactionController() {
		new Transactionns();
	}
	@CrossOrigin
	@GetMapping("/transactionPendding")
	public List<Transactionns> checkingTransaction(){
		return transactionData.transactionPendding();
	}
	
	@SuppressWarnings("deprecation")
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
			}else if(troisiemenombre==1){
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
	@PostMapping("/deposer")
	public void deposer(@RequestBody Transactionns argent)throws Exception {
		int idop = this.checknumero(argent.getNumero());
		Cout cout = coutRepos.findByIdoperateur(idop);
		float newargent = argent.getSolde()-cout.getCout_depot();
		argent.setSolde(newargent);
		System.out.println(argent.getNumero() +" "+argent.getSolde());
		transactionData.insertargent(argent.getNumero(),argent.getSolde());
	}

}