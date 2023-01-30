package com.objectmethod.demoecommerce.dto;

public class CarrelloDto {

	private Integer idCarrello;
	private Integer idCliente;
	private Integer idProdotto;

	public CarrelloDto() {
		super();
	}

	public CarrelloDto(Integer idCarrello, Integer idCliente) {
		super();
		this.idCarrello = idCarrello;
		this.idCliente = idCliente;
	}

	public CarrelloDto(Integer idCarrello, Integer idCliente, Integer idProdotto) {
		super();
		this.idCarrello = idCarrello;
		this.idCliente = idCliente;
		this.idProdotto = idProdotto;
	}
	public Integer getIdCarrello() {
		return idCarrello;
	}
	public void setIdCarrello(Integer idCarrello) {
		this.idCarrello = idCarrello;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public Integer getIdProdotto() {
		return idProdotto;
	}
	public void setIdProdotto(Integer idProdotto) {
		this.idProdotto = idProdotto;
	}
}
