package com.objectmethod.demoecommerce.controller;

import java.util.ArrayList;
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

import com.objectmethod.demoecommerce.dto.CarrelloDto;
import com.objectmethod.demoecommerce.dto.ProdottoDto;
import com.objectmethod.demoecommerce.service.CarrelloService;

@RequestMapping("/api/carrello")
@RestController
public class CarrelloController {

	@Autowired
	CarrelloService carrelloService;

	@CrossOrigin
	@GetMapping
	public List<CarrelloDto> getAllCarrello() {
		return carrelloService.getAllCarrello();
	}

	@CrossOrigin
	@GetMapping("idcliente/{id}")
	public List<CarrelloDto> getAllCarrelloByIdCliente(@PathVariable(name = "id") Integer idCliente) {
		return carrelloService.getAllCarrelloByIdCliente(idCliente);
	}

	@CrossOrigin
	@GetMapping("idcarrello/{id}")
	public CarrelloDto getCarrelloById(@PathVariable(name = "id") Integer idCarrello) {
		return carrelloService.getCarrelloById(idCarrello);
	}

	// CREA CARRELLO
	@CrossOrigin
	@PostMapping("/{id}")
	public CarrelloDto insertCarrello(@PathVariable(name = "id") Integer idCliente) {
		CarrelloDto d = CarrelloDto.builder().idCliente(idCliente).build();
		return carrelloService.insertCarrello(d);
	}

	@CrossOrigin
	@PutMapping("/{id}")
	public CarrelloDto updateCarrelloByIdClienteIdCarrello(@PathVariable(name = "id") Integer idCliente,
			@RequestParam(name = "idCarrello") Integer idCarrello) {
		CarrelloDto d = CarrelloDto.builder().idCliente(idCliente).idCarrello(idCarrello).build();

		return carrelloService.updateCarrelloByIdClienteIdCarrello(d);
	}

	@CrossOrigin
	@DeleteMapping("/{id}")
	public void deleteCarrelloByIdCarrello(@PathVariable(name = "id") Integer idCarrello) {
		carrelloService.deleteCarrello(idCarrello);
	}
}
