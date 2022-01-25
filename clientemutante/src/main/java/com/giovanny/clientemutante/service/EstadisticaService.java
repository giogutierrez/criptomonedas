package com.giovanny.clientemutante.service;

import java.time.LocalDateTime;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.giovanny.clientemutante.dto.AdnInDTO;
import com.giovanny.clientemutante.dto.ResultOutDTO;
import com.giovanny.clientemutante.entity.LogAdnEntity;
import com.giovanny.clientemutante.repository.ILogAdnRepository;
import com.giovanny.clientemutante.util.Constantes;
import com.giovanny.clientemutante.util.IdentificaMutanteUtil;
import com.giovanny.clientemutante.util.MatrizUtil;
import com.giovanny.clientemutante.util.ApplicationException;


@Service
public class EstadisticaService {
	
	private static final Logger LOGGER = Logger.getLogger(EstadisticaService.class.getSimpleName());
	
	
	@Autowired
	private ILogAdnRepository iLogAdnRepository;
	
	public ResponseEntity<ResultOutDTO> getDatos(){
		 ResultOutDTO datos = new ResultOutDTO();
		return new ResponseEntity<>(datos, HttpStatus.OK);
	}	
	
	
}
