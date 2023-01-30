package com.objectmethod.demoecommerce.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.objectmethod.demoecommerce.dto.ProdottoDto;
import com.objectmethod.demoecommerce.model.Prodotto;

@Component
public class ProdottoMapper {

	public ProdottoDto toDto(Prodotto p) {
		if (p == null) {
			return null;
		}
		ProdottoDto d = new ProdottoDto(p.getIdProdotto(), p.getNome(), p.getCosto());
		return d;
	}

	public Prodotto toProdotto(ProdottoDto d) {
		if (d == null) {
			return null;
		}
		Prodotto p = new Prodotto(d.getIdProdotto(), d.getNome(), d.getCosto());
		return p;
	}

	public List<ProdottoDto> toDtoList(List<Prodotto> pArray) {
		if (pArray == null) {
			return null;
		}
		List<ProdottoDto> d = new ArrayList<ProdottoDto>();
		for (Prodotto p : pArray) {
			d.add(toDto(p));
		}
		return d;
	}

	public List<Prodotto> toProdottoList(List<ProdottoDto> dtoArray) {
		if (dtoArray == null) {
			return null;
		}
		List<Prodotto> p = new ArrayList<Prodotto>();
		for (ProdottoDto d : dtoArray) {
			p.add(toProdotto(d));
		}
		return p;
	}
}
