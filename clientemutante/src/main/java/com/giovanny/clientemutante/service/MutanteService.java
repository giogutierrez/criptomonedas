package com.giovanny.clientemutante.service;

import java.time.LocalDateTime;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.giovanny.clientemutante.dto.AdnInDTO;
import com.giovanny.clientemutante.entity.LogAdnEntity;
import com.giovanny.clientemutante.repository.ILogAdnRepository;
import com.giovanny.clientemutante.util.Constantes;
import com.giovanny.clientemutante.util.IdentificaMutanteUtil;
import com.giovanny.clientemutante.util.MatrizUtil;
import com.giovanny.clientemutante.util.ApplicationException;


@Service
public class MutanteService {
	
	private static final Logger LOGGER = Logger.getLogger(MutanteService.class.getSimpleName());
	
	@Autowired
	private ILogAdnRepository iLogAdnRepository;

	
	/**
	 * Metodo test
	 * 
	 */	
	public String getTest() 
	{
		return Constantes.OK;
	}
	
	
/**
 * Metodo para validar adn
 * 
 * @param AdnInDTO
 * @return ResultOutDTO
 */	
public ResponseEntity<HttpStatus> validaAdn(@RequestBody AdnInDTO adn){
	

	if(adn.getDna().length < Constantes.SIZE_ADN) {
		throw new ApplicationException(Constantes.ERROR_LONGITUD + Constantes.SIZE_ADN);
	}
	
	char[][] dnaMatriz = MatrizUtil.armaMatriz(adn.getDna());
	
	LogAdnEntity consultaAdn = iLogAdnRepository.findByAdn(String.join(",", adn.getDna()));
		
	if(consultaAdn != null) {
		if(consultaAdn.getMutante()) {
			return new ResponseEntity<>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.FORBIDDEN);
		}
		
	}else{
		boolean isMutan = IdentificaMutanteUtil.isMutant(adn.getDna(), dnaMatriz);
		guardar(String.join(",", adn.getDna()) , isMutan);
		
		if(!isMutan) {
			return new ResponseEntity<>(HttpStatus.FORBIDDEN);
		}
	}
    return new ResponseEntity<>(HttpStatus.OK);
  }


/**
 * Metodo para guardar LOG
 * 
 * @param String
 * @return boolean
 */	
private void guardar(String adn, boolean ismutant) {	
	LogAdnEntity log = new LogAdnEntity();
	log.setAdn(adn);
	log.setMutante(ismutant);
	log.setFecha(LocalDateTime.now());
	iLogAdnRepository.save(log);
}
}
