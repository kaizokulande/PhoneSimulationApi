package telephone.ws_telephone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import telephone.ws_telephone.model.Back_Office;

public interface BackOfficeRepository extends JpaRepository<Back_Office, Long> {

	@Query(value="SELECT * FROM BACKOFFICE",nativeQuery=true)
	public List<Back_Office> backOffice();
	
}
