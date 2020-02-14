package tp2.Emprunt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tp2.Emprunt.bean.Client;
import tp2.Emprunt.dao.ClientDao;
import tp2.Emprunt.service.facade.ClientService;

@Service

public class ClientServiceImp implements ClientService {
	@Autowired
	private ClientDao clientDao;

	@Override
	public Client findByCin(String cin) {
		return clientDao.findByCin(cin);
	}

	@Override
	public List<Client> findByPointFiabiliteAgeLessThen(int pointFiabilite) {
		return clientDao.findByPointFiabiliteLessThan(pointFiabilite);
	}
	
	@Override
	public void save(Client client) {
		clientDao.save(client);
	}

	@Override
	public List<Client> findAll() {
		return clientDao.findAll();
	}

	

	

}
