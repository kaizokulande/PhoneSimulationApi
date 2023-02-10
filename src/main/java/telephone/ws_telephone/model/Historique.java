package telephone.ws_telephone.model;

import javax.persistence.*;
@Entity
@Table(name = "Historique")
public class Historique {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="idoperateur")
	private String idoperateur;
	@Column(name="numero")
	private String numero;
	@Column(name="numero_appele")
	private String numero_appele;
	@Column(name="name")
	private String name;
	@Column(name="duree")
	private float duree;
	@Column(name="cout_appel")
	private float cout_appel;
	@Column(name="date_appel")
	private String date_appel;
	public Historique() {}
	public String getIdoperateur() {
		return idoperateur;
	}
	public void setIdoperateur(String idoperateur) {
		this.idoperateur = idoperateur;
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
	public float getDuree() {
		return duree;
	}
	public void setDuree(float duree) {
		this.duree = duree;
	}
	public float getCout_appel() {
		return cout_appel;
	}
	public void setCout_appel(float cout_appel) {
		this.cout_appel = cout_appel;
	}
	public String getNumero_appele() {
		return numero_appele;
	}
	public void setNumero_appele(String numero_appele) {
		this.numero_appele = numero_appele;
	}
	public String getDate_appel() {
		return date_appel;
	}
	public void setDate_appel(String date_appel) {
		this.date_appel = date_appel;
	}
	public Historique(String idoperateur, String numero, String numero_appele, String name, float duree,
			float cout_appel, String date_appel) {
		this.idoperateur = idoperateur;
		this.numero = numero;
		this.numero_appele = numero_appele;
		this.name = name;
		this.duree = duree;
		this.cout_appel = cout_appel;
		this.date_appel = date_appel;
	}
	
	
}
