package telephone.ws_telephone.repository;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import telephone.ws_telephone.model.Argent;

@Repository()
public interface ArgentRepository extends JpaRepository<Argent, Long> {

	@Query(value="SELECT SUM(SOLDE) FROM ARGENT", nativeQuery=true)
	public float sommeSolde();
	
	@Query(value="SELECT * FROM ARGENT WHERE NUMERO = :numero",nativeQuery=true)
	public Argent compte1Client(String numero);
	
	
	@Query(value = "SELECT * FROM ARGENT WHERE DATE_DEPOT = (SELECT MAX(DATE_DEPOT) FROM ARGENT) AND NUMERO = :numero", nativeQuery=true)
	public Argent findArgentByNum(String numero);
	
	@Modifying
	@Transactional
	@Query(value="INSERT INTO ARGENT VALUES(:numero,:idoperateur,:solde,:date_depot)", nativeQuery=true)
	public void insertargent(String numero,int idoperateur,float solde,LocalDateTime date_depot);
}
