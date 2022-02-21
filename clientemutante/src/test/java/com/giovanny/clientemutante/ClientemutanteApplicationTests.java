package com.giovanny.clientemutante;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.giovanny.clientemutante.dto.AdnInDTO;
import com.giovanny.clientemutante.service.EstadisticaService;
import com.giovanny.clientemutante.service.MutanteService;
import com.giovanny.clientemutante.util.IdentificaMutanteUtil;
import com.giovanny.clientemutante.util.MatrizUtil;

@SpringBootTest
class ClientemutanteApplicationTests {

	@Autowired
	private MutanteService mutanteService;
	
	@Autowired
	private EstadisticaService estadisticaService;
	
	@Test
	void testService() {
		assertNotNull(mutanteService.getTest());
	}
		
	@Test
	void validaAdn() {
		
		AdnInDTO adn = new AdnInDTO();
		String[] dna = new String[]{"AAGA","CCAT","TAAT","AGGA"};
		adn.setDna(dna);
		
		assertNotNull(mutanteService.validaAdn(adn));
	}
	
	
	@Test
	void getDatos() {
		assertNotNull(estadisticaService.getDatos());
	}
	
	
	@Test
	void armaMatrizErrorCaracter() {
		AdnInDTO adn = new AdnInDTO();
		String[] dna = new String[]{"ATGX","CAGT","TTAT","AGAA"};
		adn.setDna(dna);
		
		assertNotNull(MatrizUtil.armaMatriz(adn.getDna()));
	}
	
	@Test
	void armaMatrizErrorLongitudIndividual() {
		AdnInDTO adn = new AdnInDTO();
		String[] dna = new String[]{"ATG","CAGT","TTAT","AGAA"};
		adn.setDna(dna);
		
		assertNotNull(MatrizUtil.armaMatriz(adn.getDna()));
	}
	
	@Test
	void armaMatrizErrorLongitud() {
		AdnInDTO adn = new AdnInDTO();
		String[] dna = new String[]{"CCAT","TAAT","AGGA"};
		adn.setDna(dna);
		
		assertNotNull(mutanteService.validaAdn(adn));

	}

}
