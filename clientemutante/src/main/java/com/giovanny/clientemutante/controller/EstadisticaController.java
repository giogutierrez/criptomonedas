package com.giovanny.clientemutante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import com.giovanny.clientemutante.dto.ResultOutDTO;
import com.giovanny.clientemutante.service.EstadisticaService;


@RestController
@RequestMapping("/estadisticaService")
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS })
public class EstadisticaController {
	
	@Autowired
	private EstadisticaService estadisticaService;
	
	@GetMapping("stats")
	public ResponseEntity<ResultOutDTO> getDatos(){
		
		return estadisticaService.getDatos();
	}	
	
	
	
}
