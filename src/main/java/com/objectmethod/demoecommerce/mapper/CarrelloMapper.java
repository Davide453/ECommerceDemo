package com.objectmethod.demoecommerce.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.objectmethod.demoecommerce.dto.CarrelloDto;
import com.objectmethod.demoecommerce.model.Carrello;

@Component
public class CarrelloMapper {

	public CarrelloDto toDto(Carrello carrello) {
		if (carrello == null) {
			return null;
		}
		CarrelloDto carrelloDto = new CarrelloDto(carrello.getC().getIdCliente());
		if (carrello.getIdCarrello() != null) {
			carrelloDto.setIdCarrello(carrello.getIdCarrello());
		} else {
			carrello.setIdCarrello(null);
		}
		
		if (carrello.getP() != null) {
			carrelloDto.setIdProdotto(carrello.getP().getIdProdotto());
		} else {
			carrelloDto.setIdProdotto(null);
		}
		return carrelloDto;
	}

	public Carrello toCarrello(CarrelloDto carrelloDto) {
		if (carrelloDto == null) {
			return null;
		}
		Carrello carrello = new Carrello(carrelloDto.getIdCliente());
		if (carrelloDto.getIdCarrello() != null) {
			carrello.setIdCarrello(carrelloDto.getIdCarrello());
		} else {
			carrello.setIdCarrello(null);
		}
		
		if (carrelloDto.getIdProdotto() != null) {
			carrello.getP().setIdProdotto(carrelloDto.getIdProdotto());
		} else {
			carrello.setP(null);
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
