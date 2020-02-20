package com.example.demo.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.dto.UserDTO;
import com.example.demo.models.User;

@Component("UserConverter")
public class UserConverter {
	
	public UserDTO UsertoUserDTO (User user) {
		
		UserDTO userDTO = new UserDTO();
		
		userDTO.setId_tipo(user.getId_tipo());
		userDTO.setDescripcion(user.getDescripcion());
		userDTO.setStatus(user.getStatus());
		
		return userDTO;
	}
	
	public User UserDTOtoUser (UserDTO userDTO) {
		
		User user = new User();
		
		user.setId_tipo(userDTO.getId_tipo());
		user.setDescripcion(userDTO.getDescripcion());
		user.setStatus(userDTO.getStatus());
		
		return user;
	}
	
	//una lista
	
	public List <UserDTO> UserstoUsersDTO (Iterable<User> users){
		
		List<UserDTO> usersDTO = new ArrayList <UserDTO>();
		
		for(User user:users) {
			UserDTO userDTO = new UserDTO();
			userDTO.setId_tipo(user.getId_tipo());
			userDTO.setDescripcion(user.getDescripcion());
			userDTO.setStatus(user.getStatus());
			
			usersDTO.add(userDTO);
		}
		
		return usersDTO;
	}
	
	public List <User> UsersDTOtoUsers (List<UserDTO> usersDTO){
		
		List<User> users = new ArrayList<User>();
		
		for(UserDTO userDTO:usersDTO) {
			User user = new User();
			user.setId_tipo(userDTO.getId_tipo());
			user.setDescripcion(userDTO.getDescripcion());
			user.setStatus(userDTO.getStatus());
			
			users.add(user);
		}
		
		return users;
	}

}
