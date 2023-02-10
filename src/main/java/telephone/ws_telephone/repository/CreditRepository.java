package telephone.ws_telephone.repository;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import telephone.ws_telephone.model.Credit;

@Repository()
public interface CreditRepository extends JpaRepository<Credit, Long> {
	@Query(value = "SELECT * FROM CREDIT WHERE DATE_ACHAT = (SELECT MAX(DATE_ACHAT) FROM CREDIT) AND NUMERO = :numero", nativeQuery=true)
	public Credit findCreditByNum(String numero);
	
	@Modifying
	@Transactional
	@Query(value="INSERT INTO CREDIT VALUES(:numero,:idoperateur,:solde,:date_achat)", nativeQuery=true)
	public void insertcredit(String numero,int idoperateur,int solde,LocalDateTime date_achat);
	
	
	@Query(value="SELECT * FROM RECHARGE(:numero,:idoperateur,:solde) ", nativeQuery=true)
	public void insertcredit2(String numero,int idoperateur,int solde);
	
	
}
