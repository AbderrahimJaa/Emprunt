package tp2.Emprunt.ws.rest;

import tp2.Emprunt.bean.Emprunt;
import tp2.Emprunt.service.facade.EmpruntService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stock-api/Emprunt")
public class EmpruntRest {
	@Autowired
	private EmpruntService empruntService;

	public EmpruntService getEmpruntService() {
		return empruntService;
	}

	public void setEmpruntService(EmpruntService empruntService) {
		this.empruntService = empruntService;
	}

	/**
	 * @return
	 * @see tp2.Emprunt.service.facade.EmpruntService#findByDateRestituationEffectiveIsNull()
	 */
	@GetMapping("/")
	public List<Emprunt> findByDateRestituationEffectiveIsNull() {
		return empruntService.findByDateRestituationEffectiveIsNull();
	}

	/**
	 * @param emprunt
	 * @return
	 * @see tp2.Emprunt.service.facade.EmpruntService#save(tp2.Emprunt.bean.Emprunt)
	 */
	@PostMapping("emprunt/{emprunt}")
	public int save(@RequestBody Emprunt emprunt) {
		return empruntService.save(emprunt);
	}

	/**
	 * @param idEmprunt
	 * @return
	 * @see tp2.Emprunt.service.facade.EmpruntService#restituerLivre(java.lang.Long)
	 */
	@GetMapping("idemprunt/{idEmprunt}")
	public int restituerLivre(Long idEmprunt) {
		return empruntService.restituerLivre(idEmprunt);
	}

	/**
	 * @return
	 * @see tp2.Emprunt.service.facade.EmpruntService#findall()
	 */
	@GetMapping("/emprunt/")
	public List<Emprunt> findall() {
		return empruntService.findall();
	}
	

}
