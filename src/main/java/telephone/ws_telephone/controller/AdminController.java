package telephone.ws_telephone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import telephone.ws_telephone.model.Admin;
import telephone.ws_telephone.repository.AdminRepository;
@RestController
@RequestMapping("/api")

public class AdminController {
	@Autowired
	private AdminRepository admindata;
	
	public AdminController() {
		new Admin();
	}
	@CrossOrigin
	@GetMapping("/checkAdmin")
	public boolean checkingAdmin(@RequestParam(name="password") String password){
		Admin isIn = admindata.checkAdmin(password);
		if(isIn!=null)
			return true ;
		else
			return false;
	}

}