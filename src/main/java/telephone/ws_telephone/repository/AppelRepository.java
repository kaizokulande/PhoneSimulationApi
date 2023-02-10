package telephone.ws_telephone.repository;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import telephone.ws_telephone.model.Appel;

@Repository()
public interface AppelRepository extends JpaRepository<Appel, Long> {

	@Query(value="SELECT SUM(DUREE) FROM APPEL",nativeQuery=true)
	public float dureeAppel();
	
	@Modifying
	@Transactional
	@Query(value="INSERT INTO APPEL VALUES(:numero,:numero_appele,:idoperateur,:duree,:date_appel)",nativeQuery=true)
	public void insertsimulation(String numero,String numero_appele,int idoperateur,float duree,LocalDateTime date_appel);
}
