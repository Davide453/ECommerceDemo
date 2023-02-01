package com.objectmethod.demoecommerce.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "carrello", schema = "e_commerce_demo")
@Entity
public class Carrello {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer idCarrello;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente")
	private Cliente c;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_prodotto", nullable = true)
	private Prodotto p;

	public Carrello() {
		super();
	}

	public Carrello(Integer idCliente) {
		this.c = new Cliente();
		this.p = new Prodotto();
		c.setIdCliente(idCliente);
	}

	public Carrello(Integer idProdotto, Integer idCliente) {
		super();
		this.p.setIdProdotto(idProdotto);
		this.c.setIdCliente(idCliente);
	}

	public Carrello(Integer idCarrello, Cliente c, Prodotto p) {
		super();
		this.idCarrello = idCarrello;
		this.c = c;
		this.p = p;
	}

	public Integer getIdCarrello() {
		return idCarrello;
	}

	public void setIdCarrello(Integer idCarrello) {
		this.idCarrello = idCarrello;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	public Prodotto getP() {
		return p;
	}

	public void setP(Prodotto p) {
		this.p = p;
	}

}
