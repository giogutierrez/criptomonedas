package com.giovanny.clientemutante;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.giovanny.clientemutante.dto.AdnInDTO;
import com.giovanny.clientemutante.service.MutanteService;

@SpringBootTest
class ClientemutanteApplicationTests {

	@Autowired
	private MutanteService mutanteService;
	
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void validaAdn() {
		
		AdnInDTO adn = new AdnInDTO();
		String[] dna = new String[]{"ATGC","CAGT","TTAT","AGAA"};
		adn.setDna(dna);
		
		//mutanteService.validaAdn(adn);
		assertNotNull(mutanteService.validaAdn(adn));
		
		//ResponseEntity<HttpStatus> validaAdn(@RequestBody AdnInDTO adn){
		
		
		
	}

}
