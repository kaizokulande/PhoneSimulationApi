package telephone.ws_telephone.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import telephone.ws_telephone.model.Historique;

@Repository()
public interface HistoriqueRepository extends JpaRepository<Historique, Long> {
	@Query(value="SELECT * FROM HISTORIQUE WHERE numero = :numero",nativeQuery=true)
	public List<Historique> findByNumero(String numero);
}
