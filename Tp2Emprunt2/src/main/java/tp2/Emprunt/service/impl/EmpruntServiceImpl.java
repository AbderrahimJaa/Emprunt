package tp2.Emprunt.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tp2.Emprunt.bean.Client;
import tp2.Emprunt.bean.Emprunt;
import tp2.Emprunt.dao.EmpruntDao;
import tp2.Emprunt.service.facade.ClientService;
import tp2.Emprunt.service.facade.EmpruntService;

@Service

public class EmpruntServiceImpl implements EmpruntService {
	@Autowired
	private EmpruntDao empruntDao;
	@Autowired
	private ClientService ClientService;

	@Override
	public List<Emprunt> findByDateRestituationEffectiveIsNull() {
		// TODO Auto-generated method stub
		return empruntDao.findByDateRestituationEffectiveIsNull();
	}

	@Override
	public int save(Emprunt emprunt) {

		Client client = ClientService.findByCin(emprunt.getClient().getCin());
		if (client == null) {
			return -2;
		} else if (client.getPointFiabilite() < 5) {
			return -1;

		} else {
			emprunt.setDateEmprunt(new Date());
			emprunt.setDateRestituationEffective(null);
			empruntDao.save(emprunt);

		}

		return 0;
	}

	@Override
	public int restituerLivre(Long idEmprunt) {
		Emprunt emprunt = empruntDao.getOne(idEmprunt);
		if (emprunt == null) {
			return -1;
		} else if (emprunt.getDateRestituationEffective() != null) {
			return -2;

		}else {
			
		}

		return 0;
	}

	@Override
	public List<Emprunt> findall() {
		// TODO Auto-generated method stub
		return empruntDao.findAll();
	}

	

}
