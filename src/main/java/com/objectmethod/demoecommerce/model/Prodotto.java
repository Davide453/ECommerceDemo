package com.objectmethod.demoecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "prodotto", schema = "e_commerce_demo")
@Entity
public class Prodotto {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer idProdotto;
	private String nome;
	private Integer costo;

	public Prodotto() {
		super();
	}

	public Prodotto(String nome, Integer costo) {
		this.nome = nome;
		this.costo = costo;
	}

	public Prodotto(Integer idProdotto, String nome, Integer costo) {
		this.idProdotto = idProdotto;
		this.nome = nome;
		this.costo = costo;
	}

	public Integer getIdProdotto() {
		return idProdotto;
	}

	public void setIdProdotto(Integer idProdotto) {
		this.idProdotto = idProdotto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCosto() {
		return costo;
	}

	public void setCosto(Integer costo) {
		this.costo = costo;
	}

}
