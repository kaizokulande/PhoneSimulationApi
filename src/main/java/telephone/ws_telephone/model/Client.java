package telephone.ws_telephone.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Client")
public class Client {
	@Id
	@Column(name="numero")
	private String numero;
	
	@Column(name="name")
	private String name;
	
	@Column(name="mdp")
	private String mdp;
	
	public Client() {}
	public Client(String numero, String name, String mdp) {
		this.numero = numero;
		this.name = name;
		this.mdp = mdp;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}	
}
