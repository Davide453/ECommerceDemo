package com.objectmethod.demoecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.objectmethod.demoecommerce.dto.ClienteDto;
import com.objectmethod.demoecommerce.service.ClienteService;

@RequestMapping("/api/cliente")
@RestController
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	@CrossOrigin
	@GetMapping
	public List<ClienteDto> getAllCliente() {
		return clienteService.getAllCliente();
	}

	@GetMapping("/{id}")
	public ClienteDto getClienteById(@PathVariable(name = "id") Integer id) {
		return clienteService.getClienteById(id);
	}

	@PostMapping
	public ClienteDto insertCliente(@RequestParam(name = "email") String email,
			@RequestParam(name = "password") String password) {
		ClienteDto c = new ClienteDto(email, password);
		return clienteService.insertCliente(c);
	}

	@PutMapping("/{id}")
	public ClienteDto updateCliente(@PathVariable(name = "id") Integer id, @RequestParam(name = "email") String email,
			@RequestParam(name = "password") String password) {
		return clienteService.updateCliente(new ClienteDto(id, email, password));
	}
/*
 * su una mia api genera  single page application con dentro svariati div che si abilitano e si disabilitano in base 
 * a cosa  stai facendo
 *  lista prodotti deve permettere di vedere tutti i prodotti
 *  prodotti nel mio carrello deve permettere di vedere tutti i prodotti nel tuo carrello
 *  dettaglio prodotto 
 */
	@DeleteMapping("/{id}")
	public String deleteCliente(@PathVariable(name = "id") Integer id) {
		clienteService.deleteCliente(id);
		return "Il cliente è stato eliminato";
	}
///////////

	@PostMapping("/login")
	public ClienteDto loginCliente(@RequestParam(name = "email") String email,
			@RequestParam(name = "password") String password) {
		return clienteService.findClienteByIdEPassword(email, password);
	}
}
