package com.objectmethod.demoecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.objectmethod.demoecommerce.dto.ClienteDto;
import com.objectmethod.demoecommerce.mapper.ClienteMapper;
import com.objectmethod.demoecommerce.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	ClienteMapper clienteMap;
	@Autowired
	ClienteRepository clienteRepo;

	public List<ClienteDto> getAllCliente() {
		return clienteMap.toDtoList(clienteRepo.findAll());
	}

	public ClienteDto getClienteById(Integer id) {
		return clienteMap.toDto(clienteRepo.findById(id).orElse(null));
	}

	public ClienteDto insertCliente(ClienteDto c) {
		return clienteMap.toDto(clienteRepo.save(clienteMap.toCliente(c)));
	}

	public ClienteDto updateCliente(ClienteDto c) {
		return clienteMap.toDto(clienteRepo.save(clienteMap.toCliente(c)));
	}

	public void deleteCliente(Integer id) {
		clienteRepo.deleteById(id);
	}

	public ClienteDto findClienteByIdEPassword(String email, String password) {
		if (clienteMap.toDto(clienteRepo.getCliente(email, password)) != null) {
			ClienteDto c = clienteMap.toDto(clienteRepo.getCliente(email, password));
			return c;
		}
		return null;

	}
}
