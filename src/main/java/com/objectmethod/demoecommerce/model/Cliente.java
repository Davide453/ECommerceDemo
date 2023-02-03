package com.objectmethod.demoecommerce.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "cliente", schema = "e_commerce_demo")
@Entity
public class Cliente {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer idCliente;
	private String email;
	private String password;
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<Carrello> carrelli;

}
