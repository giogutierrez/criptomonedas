package com.giovanny.clientemutante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import com.giovanny.clientemutante.dto.AdnInDTO;
import com.giovanny.clientemutante.service.MutanteService;


@RestController
@RequestMapping("/mutant")
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS })
public class MutanteController {
	
	@Autowired
	private MutanteService mutanteService;

	@GetMapping("getTest")
	public String test() {
		return mutanteService.getTest();
	}
	
	
	@PostMapping("isMutant")
	public ResponseEntity<HttpStatus> validaAdn(@RequestBody AdnInDTO adn){
		return mutanteService.validaAdn(adn);
	}	
	
	
	
}
