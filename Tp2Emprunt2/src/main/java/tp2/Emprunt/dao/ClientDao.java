package tp2.Emprunt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tp2.Emprunt.bean.Client;

@Repository

public interface ClientDao extends JpaRepository<Client, Long> {

	public Client findByCin(String cin);

	public List<Client> findByPointFiabiliteLessThan(int pointFiabilite);

}
