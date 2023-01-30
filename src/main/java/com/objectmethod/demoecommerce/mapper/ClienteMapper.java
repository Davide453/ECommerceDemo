package com.objectmethod.demoecommerce.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.objectmethod.demoecommerce.dto.ClienteDto;
import com.objectmethod.demoecommerce.model.Cliente;

@Component
public class ClienteMapper {

	public ClienteDto toDto(Cliente c) {
		if (c == null) {
			return null;
		}
		ClienteDto d = new ClienteDto(c.getIdCliente(), c.getEmail(), c.getPassword());
		return d;
	}

	public Cliente toCliente(ClienteDto d) {
		if (d == null) {
			return null;
		}
		Cliente c = new Cliente(d.getIdCliente(), d.getEmail(), d.getPassword());
		return c;
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
