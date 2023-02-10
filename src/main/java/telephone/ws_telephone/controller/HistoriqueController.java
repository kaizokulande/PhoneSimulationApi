package telephone.ws_telephone.controller;
import java.io.Console;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import telephone.ws_telephone.model.Historique;
import telephone.ws_telephone.repository.HistoriqueRepository;


@RestController
@RequestMapping("/api")
public class HistoriqueController {
	@Autowired
	private HistoriqueRepository repository;
	
	@CrossOrigin
	@GetMapping("/historiqueByNum")
	public List<Historique> findClientByNumero(String numero){
		return repository.findByNumero(numero);
	}
}
