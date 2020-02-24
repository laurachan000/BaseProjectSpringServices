package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDTO;
import com.example.demo.models.User;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private final static Logger LOG = Logger.getLogger("com.example.demo.controllers.UserController");
	
	
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
	
	
	//nuevo crud
	
	@GetMapping("getUserByNombre/{nombre}")
	public ResponseEntity<?> getUserByNombre(@PathVariable String nombre){
		
		Map<String, Object> response = new HashMap<>();
		
		UserDTO userDto = userService.getUserByNombre(nombre);
		
		if(userDto == null) {
			response.put("data", "Usuario no existe");
		}
		else {
			response.put("data", userDto);
		}
		return new ResponseEntity<Map<String, Object>>(response,HttpStatus.ACCEPTED);
		//return baseService.getHolaMundo();	
	}
	
	@GetMapping("findByNombre/{nombre}")
	public ResponseEntity<?> findByNombre(@PathVariable String nombre){
		
		Map<String, Object> response = new HashMap<>();
		
		UserDTO userDto = userService.findByNombre(nombre);
		
		if(userDto == null) {
			response.put("data", "Usuario no existe");
		}
		else {
			response.put("data", userDto);
		}
		return new ResponseEntity<Map<String, Object>>(response,HttpStatus.ACCEPTED);
		//return baseService.getHolaMundo();	
	}
	
	@PostMapping ( "AgregandoUsuario" )
    public  ResponseEntity <?>  agregandoUsuario ( @RequestBody User user ) {

        Map < String , Object > response =  new  HashMap <> ();
        
        try {
            this.userService.setUser(user);
            response.put("Todo bien carnal", "Usuario agregado");
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
            
        } catch (Exception e) {
            response.put("Nel", e.getStackTrace());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
		
    }

}
