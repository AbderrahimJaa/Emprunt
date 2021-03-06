package tp2.Emprunt.ws.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tp2.Emprunt.bean.Client;
import tp2.Emprunt.service.facade.ClientService;

@RestController
@RequestMapping("stock-api/Client")

public class ClientRest {
	@Autowired
	private ClientService clientService;

	public ClientService getClientService() {
		return clientService;
	}

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

	/**
	 * @param cin
	 * @return
	 * @see tp2.Emprunt.service.facade.ClientService#findByCin(java.lang.String)
	 */
	@GetMapping("/cin/{cin}")
	public Client findByCin(@PathVariable String cin) {
		return clientService.findByCin(cin);
	}
	
	
	@PostMapping("/")
	public void save(@RequestBody Client client) {
		clientService.save(client);
	}

	/**
	 * @return
	 * @see tp2.Emprunt.service.facade.ClientService#findAll()
	 */
	@GetMapping("/")
	public List<Client> findAll() {
		return clientService.findAll();
	}

}
