package com.giovanny.clientemutante.dto;

import lombok.Data;

@Data
public class ResultOutDTO {
	
	private Long countMutantDna = 0L;
	private Long  countHumanDna = 0L;
	private double ratio;
	
}
