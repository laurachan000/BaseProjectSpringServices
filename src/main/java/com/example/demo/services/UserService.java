package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.UserDTO;
import com.example.demo.models.User;




public interface UserService {
	
	public List<UserDTO> getUsers();
	
	public UserDTO  getUserByNombre(String nombre);
	
	public UserDTO findByNombre(String nombre);

	public void setUser(User user);

	

}
