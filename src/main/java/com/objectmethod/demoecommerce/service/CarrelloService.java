package com.objectmethod.demoecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.objectmethod.demoecommerce.dto.CarrelloDto;
import com.objectmethod.demoecommerce.mapper.CarrelloMapper;
import com.objectmethod.demoecommerce.model.Cliente;
import com.objectmethod.demoecommerce.repository.CarrelloRepository;

@Service
public class CarrelloService {

	@Autowired
	CarrelloRepository carrelloRepo;
	@Autowired
	CarrelloMapper carrelloMap;

	public List<CarrelloDto> getAllCarrello() {
		return carrelloMap.toDtoList(carrelloRepo.findAll());
	}

	public List<CarrelloDto> getAllCarrelloByIdCliente(Integer idCliente) {
		Cliente c = new Cliente();
		c.setIdCliente(idCliente);
		return carrelloMap.toDtoList(carrelloRepo.findByC(c));
	}

	public CarrelloDto getCarrelloByIdCarrello(Integer idCarrello) {
		return carrelloMap.toDto(carrelloRepo.findById(idCarrello).orElse(null));
	}

	public CarrelloDto insertCarrello(CarrelloDto c) {
		return carrelloMap.toDto(carrelloRepo.save(carrelloMap.toCarrello(c)));
	}

	public CarrelloDto updateCarrelloByIdClienteIdCarrello(CarrelloDto c) {
		return carrelloMap.toDto(carrelloRepo.save(carrelloMap.toCarrello(c)));
	}

	public void deleteCarrello(Integer idCarrello) {
		carrelloRepo.deleteById(idCarrello);

	}
}
