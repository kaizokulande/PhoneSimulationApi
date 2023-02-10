package telephone.ws_telephone.service;

import org.springframework.beans.factory.annotation.Autowired;

import telephone.ws_telephone.model.Client;
import telephone.ws_telephone.repository.ClientRepository;

public class ClientService {
	@Autowired public ClientRepository repository;
	
//	public Client checknum(String numero) {
//		return repository.findByNumero(numero);
//	}
//	public Client checkpassword(String numero,String mdp) {
//		return repository.findByNumeroAndMdp(numero,mdp);
//	}
}
