package telephone.ws_telephone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Appel")


public class Admin {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;

	public Admin() {
		
	}

	public Admin( String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
