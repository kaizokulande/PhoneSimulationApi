package telephone.ws_telephone.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Argent")
public class Argent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="numero")
	private String numero;
	@Column(name="idoperateur")
	private int idoperateur;
	@Column(name="solde")
	private float solde;
	LocalDateTime date_depot = LocalDateTime.now(); 
	public Argent() {}
	public Argent(String numero, int idoperateur, float solde, LocalDateTime date_depot) {
		super();
		this.numero = numero;
		this.idoperateur = idoperateur;
		this.solde = solde;
		this.date_depot = date_depot;
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
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public LocalDateTime getDate_depot() {
		return date_depot;
	}
	public void setDate_depot(LocalDateTime date_depot) {
		this.date_depot = date_depot;
	}

}
