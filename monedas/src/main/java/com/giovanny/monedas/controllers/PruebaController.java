package com.giovanny.monedas.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

@RestController
@RequestMapping("servicePrueba")
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS})
public class PruebaController {
	
	
	@GetMapping("getPrueba")
	public String prueba() {
		
		return "CONECCIOM";
	}
	

}
