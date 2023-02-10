package telephone.ws_telephone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client")
public class Telma_offre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	
	@Column(name="nameTelmaOffre")
	private String nameTelmaOffre;
	
	@Column(name="prixTelmaOffre")
	private int prixTelmaOffre ;
	
	public Telma_offre() {}
	public Telma_offre( String nameTelmaOffre, int prixTelmaOffre) {
		super();
		this.nameTelmaOffre = nameTelmaOffre;
		this.prixTelmaOffre = prixTelmaOffre;
	}

	public String getNameTelmaOffre() {
		return nameTelmaOffre;
	}
	public void setNameTelmaOffre(String nameTelmaOffre) {
		this.nameTelmaOffre = nameTelmaOffre;
	}
	public int getPrixTelmaOffre() {
		return prixTelmaOffre;
	}
	public void setPrixTelmaOffre(int prixTelmaOffre) {
		this.prixTelmaOffre = prixTelmaOffre;
	}
	
}
