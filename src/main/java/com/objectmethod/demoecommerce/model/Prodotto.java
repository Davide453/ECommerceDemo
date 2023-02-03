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

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "prodotto", schema = "e_commerce_demo")
@Entity
public class Prodotto {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer idProdotto;
	private String nome;
	private Integer costo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_carrello", nullable = true)
	private Carrello carrello;
	
}
