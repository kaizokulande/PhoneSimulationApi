package telephone.ws_telephone.controller;

import org.springframework.beans.factory.annotation.Autowired;

import telephone.ws_telephone.model.Cout;
import telephone.ws_telephone.repository.CoutRepository;

public class CoutController {
	@Autowired
	private CoutRepository repository;
	public Cout getCoup(int idoperateur) {
		Cout cout = repository.findByIdoperateur(idoperateur);
		return cout;
	}
}
