package com.giovanny.clientemutante.dto;

import lombok.Data;

@Data
public class ResultOutDTO {
	
	private Long count_mutant_dna;
	private Long  count_human_dna;
	private double ratio;

}
