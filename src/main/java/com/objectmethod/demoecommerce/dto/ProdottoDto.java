package com.objectmethod.demoecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProdottoDto {
	private Integer idProdotto;
	private String nome;
	private Integer costo;
	private Integer idCarrello;

}
