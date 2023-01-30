package com.objectmethod.demoecommerce.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.objectmethod.demoecommerce.dto.CarrelloDto;
import com.objectmethod.demoecommerce.model.Carrello;

@Component
public class CarrelloMapper {

	public CarrelloDto toDto(Carrello c) {
		if (c == null) {
			return null;
		}
		CarrelloDto d = new CarrelloDto(c.getIdCarrello(), c.getC().getIdCliente(), c.getP().getIdProdotto());
		return d;
	}

	public Carrello toCarrello(CarrelloDto d) {
		if (d == null) {
			return null;
		}
		Carrello c = new Carrello(d.getIdCarrello(), d.getIdCliente());
		if (d.getIdProdotto() != null) {
			c.getP().setIdProdotto(d.getIdProdotto());
		}
		return c;
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
