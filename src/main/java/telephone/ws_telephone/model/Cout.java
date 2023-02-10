package telephone.ws_telephone.model;

import javax.persistence.*;
//IDOPERATEUR,COUT_APPEL,COUT_DEPOT,COUT_TRANSFERT
@Entity
@Table(name = "Cout")
public class Cout {
	@Id
	@Column(name="idoperateur")
	private int idoperateur;
	@Column(name="cout_appel")
	private float cout_appel;
	@Column(name="cout_depot")
	private int cout_depot;
	@Column(name="cout_transfert")
	private int cout_transfert;
	public int getIdoperateur() {
		return idoperateur;
	}
	public void setIdoperateur(int idoperateur) {
		this.idoperateur = idoperateur;
	}
	public float getCout_appel() {
		return cout_appel;
	}
	public void setCout_appel(float cout_appel) {
		this.cout_appel = cout_appel;
	}
	public int getCout_depot() {
		return cout_depot;
	}
	public void setCout_depot(int cout_depot) {
		this.cout_depot = cout_depot;
	}
	public int getCout_transfert() {
		return cout_transfert;
	}
	public void setCout_transfert(int cout_transfert) {
		this.cout_transfert = cout_transfert;
	}
	public Cout() {}
	public Cout(int idoperateur, float cout_appel, int cout_depot, int cout_transfert) {
		this.idoperateur = idoperateur;
		this.cout_appel = cout_appel;
		this.cout_depot = cout_depot;
		this.cout_transfert = cout_transfert;
	}
	
}
