package telephone.ws_telephone.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Appel")
public class Appel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="numero")
	private String numero;
	@Column(name="numero_appele")
	private String numero_appele;
	@Column(name="idoperateur")
	private int idoperateur;
	@Column(name="duree")
	private float duree;
	@Column(name="date_appel")
	LocalDateTime date_appel = LocalDateTime.now();
	public Appel() {}
	
	
	public Appel(String numero, String numero_appele, int idoperateur, float duree, LocalDateTime date_appel) {
		this.numero = numero;
		this.numero_appele = numero_appele;
		this.idoperateur = idoperateur;
		this.duree = duree;
		this.date_appel = date_appel;
	}


	public String getNumero_appele() {
		return numero_appele;
	}


	public void setNumero_appele(String numero_appele)throws Exception {
		char[] charactere = numero_appele.toCharArray();
		Character[] charact = new Character[3];
		charact[0] = new Character(charactere[0]);
		charact[1] = new Character(charactere[1]);
		charact[2] = new Character(charactere[2]);
		String premier = charact[0].toString();
		String deuxieme = charact[1].toString();
		Integer troisiemenombre = Integer.parseInt(charact[2].toString());
		if (premier.compareTo("0")==0 && deuxieme.compareTo("3")==0 ) {
			if(troisiemenombre>1 && troisiemenombre<5) {
				this.numero_appele = numero_appele;
			}else {
				throw new Exception("Numero Invalide");
			}
		}else {
			throw new Exception("Numero Invalide");
		}
	}


	public LocalDateTime getDate_appel() {
		return date_appel;
	}


	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero)throws Exception {
		char[] charactere = numero.toCharArray();
		Character[] charact = new Character[3];
		charact[0] = new Character(charactere[0]);
		charact[1] = new Character(charactere[1]);
		charact[2] = new Character(charactere[2]);
		String premier = charact[0].toString();
		String deuxieme = charact[1].toString();
		Integer troisiemenombre = Integer.parseInt(charact[2].toString());
		if (premier.compareTo("0")==0 && deuxieme.compareTo("3")==0 ) {
			if(troisiemenombre>1 && troisiemenombre<5) {
				this.numero = numero;
			}else {
				throw new Exception("Numero Invalide");
			}
		}else {
			throw new Exception("Numero Invalide");
		}
	}
	public int getIdoperateur() {
		return idoperateur;
	}
	public void setIdoperateur(int idoperateur) {
		this.idoperateur = idoperateur;
	}
	public float getDuree() {
		return duree;
	}
	public void setDuree(float duree) {
		this.duree = duree;
	}
	public LocalDateTime getDateAppel() {
		return date_appel;
	}
}
