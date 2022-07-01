package com.prueba.persona.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import com.prueba.persona.dto.ConsultaDocumentoDTO;
import com.prueba.persona.entity.PersonaEntity;
import com.prueba.persona.service.PersonaService;

@RestController
@RequestMapping("/personaService")
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS })
public class PersonaController {
	
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("test")
	public String test() {
		return "OK";
	}
	
	@PostMapping("consultaXdocumento")
	public PersonaEntity consultaDocumento(@RequestBody ConsultaDocumentoDTO datos) {
		
		return personaService.consultaDocumento(datos.getNumeroDocumento());
	}
	
	@GetMapping("getPersonasMayoresEdad")
	public ResponseEntity<List<PersonaEntity>> getPersonasMayoresEdad(){
		return personaService.getPersonasMayoresEdad();
	}

}
