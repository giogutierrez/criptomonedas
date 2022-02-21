package com.giovanny.clientemutante.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.giovanny.clientemutante.dto.ConsultaOutDTO;
import com.giovanny.clientemutante.dto.ResultOutDTO;
import com.giovanny.clientemutante.repository.ILogAdnRepository;
import com.giovanny.clientemutante.util.ApplicationException;
import com.giovanny.clientemutante.util.Constantes;


@Service
public class EstadisticaService {
	
	@Autowired
	private ILogAdnRepository iLogAdnRepository;
	
	private static final Logger LOGGER = Logger.getLogger(EstadisticaService.class.getSimpleName());
	
	public ResponseEntity<ResultOutDTO> getDatos(){
		 ResultOutDTO datos = new ResultOutDTO();
		 		 
		 List<ConsultaOutDTO> listaConteo= iLogAdnRepository.countTotal();
		 
		 for(ConsultaOutDTO countIndividual: listaConteo) {
			 if(countIndividual.getMutante()) {
				 datos.setCountMutantDna(countIndividual.getConteo());
			 }else {
				 datos.setCountHumanDna(countIndividual.getConteo());
			 }
		 }
	 
		 try {
			 datos.setRatio(datos.getCountMutantDna()/datos.getCountHumanDna());
		} catch (Exception e) {
			LOGGER.severe(Constantes.ERROR_DIVISION);
			throw new ApplicationException(Constantes.ERROR_DIVISION);
		}
		return new ResponseEntity<>(datos, HttpStatus.OK);
	}	
	
	
}
