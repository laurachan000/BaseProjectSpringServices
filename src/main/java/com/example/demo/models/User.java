package com.example.demo.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuario")
public class User {
	
	//referencia a cada columna de la tabla
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tipo;
	
	@Column(length=45)
	private String descripcion;
	
	@Column(nullable=false)
	private Boolean status;

	@Column(length=45)
	private String password;
	
	
	//Getters and Setters

	public Long getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(Long id_tipo) {
		this.id_tipo = id_tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	

}
