package com.objectmethod.demoecommerce.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "cliente", schema = "e_commerce_demo")
@Entity
public class Cliente {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer idCliente;
	private String email;
	private String password;
	@OneToMany(mappedBy="c", fetch=FetchType.LAZY)
	List<Carrello> carrelli;
	public Cliente() {
		super();
	}
	public Cliente(String email, String password) {
		this.email = email;
		this.password = password;
	}
	public Cliente(Integer idCliente, String email, String password) {
		this.idCliente = idCliente;
		this.email = email;
		this.password = password;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Carrello> getCarrelli() {
		return carrelli;
	}
	public void setCarrelli(List<Carrello> carrelli) {
		this.carrelli = carrelli;
	}

	
}
