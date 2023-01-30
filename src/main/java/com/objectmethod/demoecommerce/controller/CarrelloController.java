package com.objectmethod.demoecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.objectmethod.demoecommerce.dto.CarrelloDto;
import com.objectmethod.demoecommerce.service.CarrelloService;
@RequestMapping("/api/carrello")
@RestController
public class CarrelloController {

	@Autowired
	CarrelloService carrelloService;

	@GetMapping
	public List<CarrelloDto> getAllCarrello() {
		return carrelloService.getAllCarrello();
	}

	@GetMapping("/{id}")
	public List<CarrelloDto> getAllCarrelloByIdCliente(@PathVariable(name = "id") Integer idCliente) {
		return carrelloService.getAllCarrelloByIdCliente(idCliente);
	}

	@PostMapping("/{id}")
	public CarrelloDto insertCarrello(@PathVariable(name = "id") Integer idCliente, Integer idProdotto) {
		CarrelloDto d = new CarrelloDto(idCliente, idProdotto);
		return carrelloService.insertCarrello(d);
	}

	@PutMapping("/{id}")
	public CarrelloDto updateCarrelloByIdClienteIdCarrello(@PathVariable(name = "id") Integer idCliente,
			@RequestParam(name = "idCarrello") Integer idCarrello,
			@RequestParam(name = "idProdotto") Integer idProdotto) {
		CarrelloDto d = new CarrelloDto(idCarrello, idCliente, idProdotto);
		return carrelloService.updateCarrelloByIdClienteIdCarrello(d);
	}

	@DeleteMapping
	public void deleteCarrelloByIdCarrello(Integer idCarrello) {
		carrelloService.deleteCarrello(idCarrello);
	}
}
