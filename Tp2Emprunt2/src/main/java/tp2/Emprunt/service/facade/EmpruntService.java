package tp2.Emprunt.service.facade;

import java.util.List;

import tp2.Emprunt.bean.Emprunt;

public interface EmpruntService {

	public List<Emprunt> findByDateRestituationEffectiveIsNull();

	int save(Emprunt emprunt);

	public int restituerLivre(Long idEmprunt);
	public List<Emprunt> findall();

}
