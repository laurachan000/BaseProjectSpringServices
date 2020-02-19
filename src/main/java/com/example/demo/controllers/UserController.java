package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.BaseService;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private final static Logger LOG = Logger.getLogger("com.example.controllers.UserController");
	
	
	@Autowired
	UserService userService;
	
	@GetMapping("getUsers")
	public ResponseEntity<?> getUsers(){
		
		
		Map<String, Object> response = new HashMap<>();
		
		if(userService.getUsers().isEmpty()) {
			response.put("data", "No hay Usuarios Registrados");
		}
		else {
			response.put("data", userService.getUsers());
		}
		
		
		return new ResponseEntity<Map<String, Object>>(response,HttpStatus.ACCEPTED);
		
		//return baseService.getHolaMundo();
		
	}

}
