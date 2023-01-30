package com.objectmethod.demoecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.objectmethod.demoecommerce.dto.ProdottoDto;
import com.objectmethod.demoecommerce.mapper.ProdottoMapper;
import com.objectmethod.demoecommerce.repository.ProdottoRepository;

@Service
public class ProdottoService {
	@Autowired
	ProdottoMapper prodottoMap;
	@Autowired
	ProdottoRepository prodottoRepo;

	public List<ProdottoDto> getAllProdotto() {
		return prodottoMap.toDtoList(prodottoRepo.findAll());
	}

	public ProdottoDto getProdottoById(Integer id) {
		return prodottoMap.toDto(prodottoRepo.findById(id).orElse(null));
	}

	public ProdottoDto insertProdotto(ProdottoDto p) {
		return prodottoMap.toDto(prodottoRepo.save(prodottoMap.toProdotto(p)));
	}

	public ProdottoDto updateProdotto(ProdottoDto p) {
		return prodottoMap.toDto(prodottoRepo.save(prodottoMap.toProdotto(p)));
	}

	public void deleteProdotto(Integer id) {
		prodottoRepo.deleteById(id);
	}
	
}
