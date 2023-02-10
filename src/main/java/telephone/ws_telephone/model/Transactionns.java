package telephone.ws_telephone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transactionns")


public class Transactionns {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="idtransaction")
	private int idtransaction;
	@Column(name="numero")
	private String numero;
	@Column(name="solde")
	private float solde;
	@Column(name="action")
	private String action;
	@Column(name="validation")
	private String validation;
	
	public Transactionns(int idtransaction, String numero, float solde, String action, String validation) {
		super();
		this.idtransaction = idtransaction;
		this.numero = numero;
		this.solde = solde;
		this.action = action;
		this.validation = validation;
	}

	public Transactionns() {
		// TODO Auto-generated constructor stub
	}

	public int getIdtransaction() {
		return idtransaction;
	}

	public void setIdtransaction(int idtransaction) {
		this.idtransaction = idtransaction;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getValidation() {
		return validation;
	}

	public void setValidation(String validation) {
		this.validation = validation;
	}

}
