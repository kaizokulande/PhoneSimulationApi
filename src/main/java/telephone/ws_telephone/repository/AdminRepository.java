package telephone.ws_telephone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import telephone.ws_telephone.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

	@Query(value="SELECT * FROM ADMIN WHERE PASSWORD=md5(:password)",nativeQuery=true)
	public Admin checkAdmin(String password);
	
}
