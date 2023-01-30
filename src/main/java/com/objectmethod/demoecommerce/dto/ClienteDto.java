package com.objectmethod.demoecommerce.dto;

public class ClienteDto {

	private Integer idCliente;
	private String email;
	private String password;

	public ClienteDto() {
		super();
	}

	public ClienteDto(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public ClienteDto(Integer idCliente, String email, String password) {
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

}
