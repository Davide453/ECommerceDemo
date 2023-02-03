package com.objectmethod.demoecommerce.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.objectmethod.demoecommerce.dto.CarrelloDto;
import com.objectmethod.demoecommerce.model.Carrello;
import com.objectmethod.demoecommerce.model.Cliente;

@Component
public class CarrelloMapper {
	@Autowired
	ProdottoMapper prodottoMap;

	public CarrelloDto toDto(Carrello carrello) {
		if (carrello == null) {
			return null;
		}
		CarrelloDto carrelloDto = CarrelloDto.builder().idCliente(carrello.getCliente().getIdCliente()).build();
		if (carrello.getIdCarrello() != null) {
			carrelloDto.setIdCarrello(carrello.getIdCarrello());
		}
		if (carrello.getProdotto() != null) {
			carrelloDto.setProdottoDto(prodottoMap.toDtoList(carrello.getProdotto()));
		}
		return carrelloDto;
	}

	public Carrello toCarrello(CarrelloDto carrelloDto) {
		if (carrelloDto == null) {
			return null;
		}
		Carrello carrello = Carrello.builder().cliente(Cliente.builder().idCliente(carrelloDto.getIdCliente()).build())
				.build();
		if (carrelloDto.getIdCarrello() != null) {
			carrello.setIdCarrello(carrelloDto.getIdCarrello());

		}

		if (carrelloDto.getProdottoDto() != null) {
			carrello.setProdotto(prodottoMap.toProdottoList(carrelloDto.getProdottoDto()));
		}
		return carrello;
	}

	public List<CarrelloDto> toDtoList(List<Carrello> cArray) {
		if (cArray == null) {
			return null;
		}
		List<CarrelloDto> d = new ArrayList<CarrelloDto>();
		for (Carrello c : cArray) {
			d.add(toDto(c));
		}
		return d;
	}

	public List<Carrello> toCarrelloList(List<CarrelloDto> dArray) {
		if (dArray == null) {
			return null;
		}
		List<Carrello> c = new ArrayList<Carrello>();
		for (CarrelloDto d : dArray) {
			c.add(toCarrello(d));
		}
		return c;
	}
}
