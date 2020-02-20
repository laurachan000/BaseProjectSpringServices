package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import com.example.demo.models.User;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User, Long>{
	
	public User findByDescripcion(String descripcion);
		
	@Query("select user from User user where user.descripcion=?1")
	public User getUserByDescripcion(String descripcion);

}
