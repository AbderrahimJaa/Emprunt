package tp2.Emprunt.ws.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tp2.Emprunt.bean.Livre;
import tp2.Emprunt.service.facade.LivreService;
@RestController
@RequestMapping("stock-api/Livre")

public class LivreRest {
	@Autowired
	 public LivreService livreService;

	/**
	 * @param isBnLivre
	 * @return
	 * @see tp2.Emprunt.service.facade.LivreService#findByisBnLivre(java.lang.String)
	 */
	 @GetMapping("/")
	public Livre findByisBnLivre(@PathVariable String isBnLivre) {
		return livreService.findByisBnLivre(isBnLivre);
	}
	 

}
