package telephone.ws_telephone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import telephone.ws_telephone.model.Telma_offre;
@Repository

public interface TelmaOffreRepository extends JpaRepository<Telma_offre, Long> {
	
	@Query(value="INSERT INTO TELMA_OFFRE(NAME_TELMA_OFFRE,PRIX_TELMA_OFFRE) VALUES (:nameOffre, :prixOffre)",nativeQuery=true)
	public void creationOffre(String nameOffre, int prixOffre);
	
	@Query(value="SELECT * FROM TELMA_OFFRE",nativeQuery=true)
	public List<Telma_offre> getAllTelmaOffre();
	
	@Query(value="DELETE FROM TELMA_OFFRE WHERE name_telma_offre= :TelmaOffreName",nativeQuery=true)
	public void deleteOffre(String TelmaOffreName);

}