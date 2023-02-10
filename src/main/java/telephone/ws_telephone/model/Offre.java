package telephone.ws_telephone.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Offre")

public class Offre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="numero")
	private String numero;
	@Column(name="idoperateur")
	private int idoperateur;
	@Column(name="nameOffre")
	private String name_offre;
	@Column(name="prixOffre")
	private int prix_offre;
	@Column(name="dateAchat")
	private LocalDateTime date_achat = LocalDateTime.now(); 
	public Offre() {}
	public Offre(String numero, int idoperateur, String name_offre, int prix_offre, LocalDateTime date_achat) {
		super();
		this.numero = numero;
		this.idoperateur = idoperateur;
		this.name_offre = name_offre;
		this.prix_offre = prix_offre;
		this.date_achat = date_achat;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getIdoperateur() {
		return idoperateur;
	}
	public void setIdoperateur(int idoperateur) {
		this.idoperateur = idoperateur;
	}
	public String getName_offre() {
		return name_offre;
	}
	public void setName_offre(String name_offre) {
		this.name_offre = name_offre;
	}
	public int getPrix_offre() {
		return prix_offre;
	}
	public void setPrix_offre(int prix_offre) {
		this.prix_offre = prix_offre;
	}
	public LocalDateTime getDate_achat() {
		return date_achat;
	}
	public void setDate_achat(LocalDateTime date_achat) {
		this.date_achat = date_achat;
	}

}
