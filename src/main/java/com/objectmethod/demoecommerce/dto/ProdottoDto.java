package com.objectmethod.demoecommerce.dto;

public class ProdottoDto {
	private Integer idProdotto;
	private String nome;
	private Integer costo;
private CarrelloDto carelloDto;
	public ProdottoDto() {
		super();
	}

	public ProdottoDto(String nome, Integer costo) {
		this.nome = nome;
		this.costo = costo;
	}

	public ProdottoDto(Integer idProdotto, String nome, Integer costo) {
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

	public CarrelloDto getCarelloDto() {
		return carelloDto;
	}

	public void setCarelloDto(CarrelloDto carelloDto) {
		this.carelloDto = carelloDto;
	}

}
