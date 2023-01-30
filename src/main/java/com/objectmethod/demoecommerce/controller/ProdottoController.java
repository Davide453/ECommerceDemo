package com.objectmethod.demoecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.objectmethod.demoecommerce.dto.ProdottoDto;
import com.objectmethod.demoecommerce.service.ProdottoService;

@RequestMapping("/api/prodotto")
@RestController
public class ProdottoController {
	@Autowired
	ProdottoService prodottoService;

	@GetMapping
	public List<ProdottoDto> getAllProdotto() {
		return prodottoService.getAllProdotto();
	}

	@GetMapping("/{id}")
	public ProdottoDto getProdottoById(@PathVariable(name = "id") Integer id) {
		return prodottoService.getProdottoById(id);
	}

	@PostMapping
	public ProdottoDto insertProdotto(@RequestParam("nome") String nome, @RequestParam("costo") Integer costo) {
		return prodottoService.insertProdotto(new ProdottoDto(nome, costo));
	}

	@PutMapping("/{id}")
	public ProdottoDto updateProdotto(@PathVariable(name = "id") Integer id, @RequestParam("nome") String nome,
			@RequestParam("costo") Integer costo) {
		return prodottoService.updateProdotto(new ProdottoDto(id, nome, costo));
	}

	@DeleteMapping("/{id}")
	public String deleteProdotto(@PathVariable(name = "id") Integer id) {
		prodottoService.deleteProdotto(id);
		return "Il prodotto è stato cancellato";
	}
}
