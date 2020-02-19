package com.example.demo.controllers;

import com.example.demo.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@RestController
@RequestMapping("/base")
public class BaseController {
	
	private final static Logger LOG = Logger.getLogger("com.example.controllers.BaseController");

	//inyeccion para obtener las funciones de la interfaz
	@Autowired
	BaseService baseService;
	@GetMapping("holaMundo")
	public ResponseEntity<?> holaMundo(){
		Map<String, Object> respuesta = new HashMap<>();
		
		LOG.info("Homa mundo desde Spring Boot getHolaMundo");
		respuesta.put("respuesta", "Hola mundo desde Spring Boot - getHolaMundo - 202Accepted");
		return new ResponseEntity<Map<String, Object>>(respuesta,HttpStatus.ACCEPTED);
		
	}
	
	
	@GetMapping("getHolaMundo")
	public ResponseEntity<?> getHolaMundo(){
		
		return baseService.getHolaMundo();
		
	}

}
