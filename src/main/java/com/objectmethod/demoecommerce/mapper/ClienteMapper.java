package com.objectmethod.demoecommerce.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.objectmethod.demoecommerce.dto.CarrelloDto;
import com.objectmethod.demoecommerce.dto.ClienteDto;
import com.objectmethod.demoecommerce.model.Carrello;
import com.objectmethod.demoecommerce.model.Cliente;

@Component
public class ClienteMapper {
	@Autowired
	CarrelloMapper carrelloMapper;

	public ClienteDto toDto(Cliente cliente) {
		if (cliente == null) {
			return null;
		}
		ClienteDto clienteDto = new ClienteDto(cliente.getIdCliente(), cliente.getEmail(), cliente.getPassword());
		clienteDto.setCarrelloDto(carrelloMapper.toDtoList(cliente.getCarrelli()));
		return clienteDto;
	}

	public Cliente toCliente(ClienteDto clienteDto) {
		if (clienteDto == null) {
			return null;
		}

		Cliente cliente = new Cliente(clienteDto.getIdCliente(), clienteDto.getEmail(), clienteDto.getPassword(),
				carrelloMapper.toCarrelloList(clienteDto.getCarrelloDto()));
		return cliente;
	}

	public List<ClienteDto> toDtoList(List<Cliente> cArray) {
		if (cArray == null) {
			return null;
		}
		List<ClienteDto> d = new ArrayList<ClienteDto>();
		for (Cliente c : cArray) {
			d.add(toDto(c));
		}
		return d;
	}

	public List<Cliente> toClienteList(List<ClienteDto> dArray) {
		if (dArray == null) {
			return null;
		}
		List<Cliente> c = new ArrayList<Cliente>();
		for (ClienteDto d : dArray) {
			c.add(toCliente(d));
		}
		return c;
	}

}
