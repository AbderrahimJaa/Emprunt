package tp2.Emprunt.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tp2.Emprunt.bean.Livre;
import tp2.Emprunt.dao.LivreDao;
import tp2.Emprunt.service.facade.LivreService;

@Service

public class LivreServiceImpl implements LivreService {
	@Autowired
	private LivreDao livreDao;

	@Override
	public Livre findByisBnLivre(String isBnLivre) {
		
		return livreDao.findByisBnLivre(isBnLivre);
	}

	}

	


