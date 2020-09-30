package com.escalab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="marca")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMarca;
	
	@Size(max = 200, message = "Descripción debe tener máximo 200 caracteres")
	@Column(name = "descripcion", nullable = false, length = 200 )
	private String descripcion;
	
	@Size(max = 200, message = "Dirección debe tener máximo 200 caracteres")
	@Column(name = "direccion", nullable = true, length = 200 )
	private String direccion;
	
	@Size(max = 200, message = "Ciudad debe tener máximo 200 caracteres")
	@Column(name = "ciudad", nullable = true, length = 200 )
	private String ciudad;

	public Integer getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
