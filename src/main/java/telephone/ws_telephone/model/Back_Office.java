package telephone.ws_telephone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Back_Office")


public class Back_Office  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name="name")
	private String name ;
	@Column(name="numero")
	private String numero;
	@Column(name="soldea")
	private Integer soldea;
	@Column(name="nameoffre")
 	private String nameOffre;
	@Column(name="soldec")
 	private Integer soldec ;
	@Column(name="duree")
 	private Integer duree;
	public Back_Office() {
		// TODO Auto-generated constructor stub
	}

	public Back_Office(String name, String numero, Integer soldea, String nameOffre, Integer soldec, Integer duree) {
		super();
		this.name = name;
		this.numero = numero;
		this.soldea = soldea;
		this.nameOffre = nameOffre;
		this.soldec = soldec;
		this.duree = duree;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Integer getSoldea() {
		return soldea;
	}

	public void setSoldea(Integer soldea) {
		this.soldea = soldea;
	}

	public String getNameOffre() {
		return nameOffre;
	}

	public void setNameOffre(String nameOffre) {
		this.nameOffre = nameOffre;
	}

	public Integer getSoldec() {
		return soldec;
	}

	public void setSoldec(Integer soldec) {
		this.soldec = soldec;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	
	
}
