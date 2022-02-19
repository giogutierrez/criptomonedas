package com.giovanny.clientemutante.service;

import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.giovanny.clientemutante.dto.ResultOutDTO;


@Service
public class EstadisticaService {
	
	private static final Logger LOGGER = Logger.getLogger(EstadisticaService.class.getSimpleName());
	
	public ResponseEntity<ResultOutDTO> getDatos(){
		 ResultOutDTO datos = new ResultOutDTO();
		 
		 LOGGER.severe("");
		 
		return new ResponseEntity<>(datos, HttpStatus.OK);
	}	
	
	
}
