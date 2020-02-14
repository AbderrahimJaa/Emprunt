package tp2.Emprunt.service.facade;

import java.util.List;

import tp2.Emprunt.bean.Client;

public interface ClientService {
	public Client findByCin(String cin);

	public List<Client> findByPointFiabiliteAgeLessThen(int pointFiabilite);
	public void save(Client client);
	public List<Client> findAll();
}
