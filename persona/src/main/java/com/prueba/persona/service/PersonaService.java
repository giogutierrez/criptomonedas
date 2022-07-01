package com.prueba.persona.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.prueba.persona.entity.PersonaEntity;
import com.prueba.persona.repository.IPersonaRepository;
import com.prueba.persona.util.Constantes;

@Service
public class PersonaService {
	
	@Autowired
	IPersonaRepository iPersonaRepository;
	
	
	public PersonaEntity consultaDocumento(String numeroDocumento) {
		PersonaEntity persona = new PersonaEntity();
		persona = iPersonaRepository.findBynumeroDocumento(numeroDocumento);
		return persona;
	}
	
	public ResponseEntity<List<PersonaEntity>> getPersonasMayoresEdad(){
		
		List<PersonaEntity> personas = new ArrayList<PersonaEntity>();
		
		personas = iPersonaRepository.findByEdad(Constantes.EDAD_MAYORES);
		
		if(personas.size() > 0 ) {
			return new ResponseEntity<>(personas, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
