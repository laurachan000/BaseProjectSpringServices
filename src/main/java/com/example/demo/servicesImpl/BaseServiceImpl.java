package com.example.demo.servicesImpl;

import com.example.demo.services.BaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Service
public class BaseServiceImpl implements BaseService {
	
	private final static Logger LOG = Logger.getLogger("com.example.servicesImpl.BaseServiceImpl");

	@Override
	public ResponseEntity<?> getHolaMundo() {
		
		Map<String, Object> respuesta = new HashMap<>();
		
		LOG.info("Homa mundo desde Spring Boot");
		respuesta.put("respuesta", "Hola mundo desde Spring Boot - 202Accepted");
		return new ResponseEntity<Map<String, Object>>(respuesta,HttpStatus.ACCEPTED);
	}

}
