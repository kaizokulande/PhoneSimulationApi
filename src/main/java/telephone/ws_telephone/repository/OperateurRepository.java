package telephone.ws_telephone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import telephone.ws_telephone.model.Operateur;

@Repository()
public interface OperateurRepository extends JpaRepository<Operateur,Long>{
	public Operateur findByIdoperateur(int idoperateur);
}
