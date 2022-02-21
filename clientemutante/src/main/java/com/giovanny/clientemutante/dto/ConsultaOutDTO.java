package com.giovanny.clientemutante.dto;

import lombok.Data;

@Data
public class ConsultaOutDTO {
	private Long conteo;
	private Boolean mutante;
	
	  public ConsultaOutDTO(Long conteo, Boolean mutante) {
		    this.conteo = conteo;
		    this.mutante  = mutante;
		  }

}
