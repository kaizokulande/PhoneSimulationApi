package telephone.ws_telephone.controller;

import java.io.Console;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import telephone.ws_telephone.model.Appel;
import telephone.ws_telephone.model.Cout;
import telephone.ws_telephone.model.Credit;
import telephone.ws_telephone.model.Operateur;
import telephone.ws_telephone.repository.AppelRepository;
import telephone.ws_telephone.repository.CoutRepository;
import telephone.ws_telephone.repository.CreditRepository;
import telephone.ws_telephone.repository.OperateurRepository;

@RestController
@RequestMapping("/api")
public class AppelController {
	
	@Autowired
	private AppelRepository appeldata;
	@Autowired
	private CreditRepository repository;
	@Autowired
	private OperateurRepository operateurdata;
	@Autowired
	private CoutRepository repositorycout;
	public AppelController(){
		new Appel();
	}
	@CrossOrigin
	@GetMapping("/dureeAppel")
	public float findClientByNumero(){
		float dureeAppel = appeldata.dureeAppel();
		return dureeAppel;
	}
	@PostMapping("/simulation")
	public void appeler(Appel appel)throws Exception {
		try {
			appeldata.save(appel);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public int creditrestant(int credit,float duree,float coup_appel) {
		float coup = duree*coup_appel;
		int newcredit = 0;
		double creditused = credit-(duree*coup_appel);
		if(credit >= coup) {
			newcredit = (int)Math.ceil(creditused);
		}
		return newcredit;
	}
	public void insertcredit(Credit credit) {
		repository.save(credit);
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
	@PostMapping("/appeler")
	public void insertappel(@RequestBody Appel appel)throws Exception {
		Credit credit= repository.findCreditByNum(appel.getNumero());
		int idop = this.checknumero(appel.getNumero_appele());
		Operateur operateur = operateurdata.findByIdoperateur(idop);
		Cout cout = repositorycout.findByIdoperateur(operateur.getIdoperateur());
		int restecredit = this.creditrestant(credit.getSolde(),appel.getDuree(),cout.getCout_appel());
		appel.setIdoperateur(operateur.getIdoperateur());
		Credit newcredit = new Credit();
		newcredit.setNumero(appel.getNumero());
		newcredit.setIdoperateur(operateur.getIdoperateur());
		newcredit.setSolde(restecredit);
		newcredit.setDate_achat(credit.getDate_achat());
	    LocalDateTime date_achat = LocalDateTime.now();
		repository.insertcredit(newcredit.getNumero(),newcredit.getIdoperateur(),newcredit.getSolde(),date_achat);
		appeldata.insertsimulation(appel.getNumero(),appel.getNumero_appele(),appel.getIdoperateur(),appel.getDuree(),appel.getDate_appel());
	}
	
}


