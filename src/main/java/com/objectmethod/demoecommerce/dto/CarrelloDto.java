package com.objectmethod.demoecommerce.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
public class CarrelloDto {

	private Integer idCarrello;
	private Integer idCliente;
	private List<ProdottoDto> prodottoDto;

}
