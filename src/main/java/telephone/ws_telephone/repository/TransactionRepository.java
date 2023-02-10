package telephone.ws_telephone.repository;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import telephone.ws_telephone.model.Transactionns;


public interface TransactionRepository extends JpaRepository<Transactionns, Long> {
	@Query(value="SELECT * FROM TRANSACTIONNS WHERE VALIDATION='FALSE'",nativeQuery=true)
	public List<Transactionns> transactionPendding();
	
	
	
	@Query(value="SELECT * FROM TRANSACTION_DEPOT(:numero,:solde)", nativeQuery=true)
	public void insertargent(String numero,float solde);
}
