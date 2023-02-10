package telephone.ws_telephone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import telephone.ws_telephone.model.Client;

@Repository()
public interface ClientRepository extends JpaRepository<Client, Long> {

	@Query(value="SELECT * FROM CLIENT", nativeQuery=true)
	public List<Client> findAllClient();
	
	@Query(value = "SELECT * FROM CLIENT WHERE NUMERO = :numero", nativeQuery=true)
	public Client findClientByNum(String numero);de 
	
	
	@Query(value="SELECT COUNT(NUMERO)  FROM CLIENT", nativeQuery=true)
	public int nbUtilisateur();	
	
	
	public Client findByNumero(String numero);
	public Client findByNumeroAndMdp(String numero, String mdp);
	
	
}
