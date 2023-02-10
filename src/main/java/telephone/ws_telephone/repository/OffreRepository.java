package telephone.ws_telephone.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import telephone.ws_telephone.model.Offre;
@Repository()
public interface OffreRepository extends JpaRepository<Offre, Long> {
	
	@Query(value="SELECT COUNT(NAME_OFFRE) FROM OFFRE",nativeQuery=true)
	public int offreVendus();
	
}
