package telephone.ws_telephone.model;

import javax.persistence.*;

@Entity
@Table(name = "operateur")
public class Operateur {
	@Id
	@Column(name="idoperateur")
	private int idoperateur;
	@Column(name="name")
	private String name;
	public int getIdoperateur() {
		return idoperateur;
	}
	public void setIdoperateur(int idoperateur) {
		this.idoperateur = idoperateur;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Operateur(int idopateur, String name) {
		this.idoperateur = idopateur;
		this.name = name;
	}
	public Operateur() {}
}
