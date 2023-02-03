package com.objectmethod.demoecommerce.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "carrello", schema = "e_commerce_demo")
@Entity
public class Carrello {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer idCarrello;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	@OneToMany(mappedBy = "carrello", fetch = FetchType.LAZY)
	private List<Prodotto> prodotto;

	public Integer getIdCarrello() {
		return idCarrello;
	}

	public void setIdCarrello(Integer idCarrello) {
		this.idCarrello = idCarrello;
	}

}
