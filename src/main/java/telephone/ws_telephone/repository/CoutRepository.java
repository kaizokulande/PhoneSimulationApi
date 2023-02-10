package telephone.ws_telephone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import telephone.ws_telephone.model.Cout;

@Repository()
public interface CoutRepository extends JpaRepository<Cout, Long> {
	public Cout findByIdoperateur(int idoperateur);
}
