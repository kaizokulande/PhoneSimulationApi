package telephone.ws_telephone.controller;

import org.springframework.beans.factory.annotation.Autowired;

import telephone.ws_telephone.model.Operateur;
import telephone.ws_telephone.repository.OperateurRepository;

public class OperateurController {
	@Autowired
	private OperateurRepository operateurdata;
	private Operateur operateur;
	
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
	public Operateur findOperateur(String numeroappele)throws Exception {
		try {
			int idoperateur = this.checknumero(numeroappele);
			Operateur opreateur = operateurdata.findByIdoperateur(idoperateur);
		} catch (Exception e) {
			e.getMessage();
		}
		return operateur;
	}
}
