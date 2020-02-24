package com.example.demo.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.dto.UserDTO;
import com.example.demo.models.User;

@Component("UserConverter")
public class UserConverter {
	
	public UserDTO UsertoUserDTO (User user) {
		
		if(user!=null) {
			UserDTO userDTO = new UserDTO();
			userDTO.setId_usuario(user.getId_usuario());
			userDTO.setNombre(user.getNombre());
			userDTO.setApellido_paterno(user.getApellido_paterno());
			userDTO.setRoles(user.getRoles());
			
			return userDTO;
		}
		
		return null;
	}
	
	public User UserDTOtoUser (UserDTO userDTO) {
		
		User user = new User();
		
		user.setId_usuario(userDTO.getId_usuario());
		user.setNombre(userDTO.getNombre());
		user.setApellido_paterno(userDTO.getApellido_paterno());
		
		
		return user;
	}
	
	//una lista
	
	
	
	
	public List <UserDTO> UserstoUsersDTO (Iterable<User> users){
		
		List<UserDTO> usersDTO = new ArrayList <UserDTO>();
		
		for(User user:users) {
			UserDTO userDTO = new UserDTO();
			userDTO.setId_usuario(user.getId_usuario());
			userDTO.setNombre(user.getNombre());
			userDTO.setApellido_paterno(user.getApellido_paterno());
			userDTO.setRoles(user.getRoles());
			usersDTO.add(userDTO);
		}
		
		return usersDTO;
	}
	
	public List <User> UsersDTOtoUsers (List<UserDTO> usersDTO){
		
		List<User> users = new ArrayList<User>();
		
		for(UserDTO userDTO:usersDTO) {
			User user = new User();
			user.setId_usuario(userDTO.getId_usuario());
			user.setNombre(userDTO.getNombre());
			user.setApellido_paterno(userDTO.getApellido_paterno());
			user.setRoles(userDTO.getRoles());
			
			users.add(user);
		}
		
		return users;
	}

}
