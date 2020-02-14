package tp2.Emprunt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tp2.Emprunt.bean.Livre;
@Repository
public interface LivreDao extends JpaRepository<Livre, Long> {
	public Livre findByisBnLivre(String isBnLivre);

}
