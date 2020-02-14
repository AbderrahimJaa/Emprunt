package tp2.Emprunt.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tp2.Emprunt.bean.Emprunt;

@Repository

public interface EmpruntDao extends JpaRepository<Emprunt, Long> {
	public List<Emprunt> findByDateRestituationEffectiveIsNull();

	
}
