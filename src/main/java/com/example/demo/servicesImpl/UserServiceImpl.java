package com.example.demo.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.converter.UserConverter;
import com.example.demo.dto.UserDTO;
import com.example.demo.repository.UserRepository;
import java.util.List;
import com.example.demo.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	@Qualifier("UserConverter")
	private UserConverter userConverter;
	
	@Override
	public List<UserDTO> getUsers() {
		// TODO Auto-generated method stub
		
		return userConverter.UserstoUsersDTO(userRepository.findAll());
		//return (List<UserDTO>) userRepository.findAll();
	}

}
