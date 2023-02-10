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


import telephone.ws_telephone.model.Client;
import telephone.ws_telephone.repository.ClientRepository;
import telephone.ws_telephone.service.ClientService;
import telephone.ws_telephone.utils.Helper;
import telephone.ws_telephone.utils.Utils;
@RestController
@RequestMapping("/api")


public class ClientController  {

	@Autowired
	private ClientRepository clientdata;
	public ClientService service;
	public ClientController(){
		new Client();
	}
	@CrossOrigin
	@GetMapping("/findClientByNum")
	public Client findClientByNumero(@RequestParam String numero){
		Client clientFind = clientdata.findClientByNum(numero);
		return clientFind ;
	}
	@CrossOrigin
	@GetMapping("/findAllClient")
	public List<Client> findAllClientController(){
		return clientdata.findAllClient();
	}	
	@CrossOrigin
	@GetMapping("/nombreUtilisateur")
	public int nombreUtilisateur(){
		int nbUtilisateur = clientdata.nbUtilisateur();
		return nbUtilisateur ;
	}
	
	@PostMapping("/souscrire")
	@CrossOrigin
	public Client createClient (@RequestBody Client client) throws Exception{
		Client newclientClient = new Client();
		String tempnum = client.getNumero();
		String password = Utils.hashpassword(client.getMdp());
		client.setMdp(password);
		if (tempnum !=null) {
			Client clientbdd= clientdata.findByNumero(tempnum);;
			if (clientbdd != null) {
				throw new Exception("le numero "+tempnum+" existe deja");
			}else {
				newclientClient = clientdata.save(client);
			}
		}
		return newclientClient;
	}
	
	@PostMapping("/conection")
	@CrossOrigin
	public Client login(@RequestBody Client client) throws Exception{
		String tempnumero = client.getNumero();
		String temppassword = client.getMdp();
		Client clientbdd = new Client();
		if (tempnumero !=null && temppassword!=null ) {
			String password = Helper.hashpassword(temppassword);
			clientbdd = clientdata.findByNumeroAndMdp(tempnumero, password);
		}else {
			throw new Exception("Vous n'avez pas encore de compte, veuillez vous incrire");
		}
		if (clientbdd == null) {
			throw new Exception("Mot de passe ou numero incorrecte");
		}
		return clientbdd;
	}
}
