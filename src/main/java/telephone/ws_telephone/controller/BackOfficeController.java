package telephone.ws_telephone.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import telephone.ws_telephone.model.Back_Office;
import telephone.ws_telephone.repository.BackOfficeRepository;

@RestController
@RequestMapping("/api")
public class BackOfficeController {
	@Autowired
	private BackOfficeRepository backOfficedata;
	
	public BackOfficeController() {
		new Back_Office();
	}
	
	@CrossOrigin
	@GetMapping("/backOffice")
	public List<Back_Office> fillData() {
		return backOfficedata.backOffice();
	}

}
