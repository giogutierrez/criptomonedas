package com.giovanny.clientemutante.dto;

import lombok.Data;

@Data
public class ResultOutDTO {
	
	private Long countMutantDna;
	private Long  countHumanDna;
	private double ratio;

}
