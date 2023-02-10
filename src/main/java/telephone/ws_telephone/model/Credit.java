package telephone.ws_telephone.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Credit")
	
public class Credit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="numero")
	private String numero;
	@Column(name="idoperateur")
	private int idoperateur;
	@Column(name="solde")
	private int solde;
	@Column(name="dateAchat")
	private LocalDateTime date_achat = LocalDateTime.now(); 

	public Credit() {}

	public Credit(String numero, int idoperateur, int solde, LocalDateTime date_achat) {
		super();
		this.numero = numero;
		this.idoperateur = idoperateur;
		this.solde = solde;
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

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public LocalDateTime getDate_achat() {
		return date_achat;
	}

	public void setDate_achat(LocalDateTime date_achat) {
		this.date_achat = date_achat;
	}

}
