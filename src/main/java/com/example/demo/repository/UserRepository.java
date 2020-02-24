package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	public User findByNombre(String nombre);
	
	@Query("select user from User user where user.nombre=?1")
	public User getUserByNombre(String nombre);

}
