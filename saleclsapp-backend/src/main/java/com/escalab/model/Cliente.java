package com.escalab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	@Size(min = 20, max = 200, message = "Nombres debe tener máximo 200 caracteres")
	@Column(name = "nombre_cliente", nullable = false, length = 200 )
	private String nombreCliente;
	
	@Size(max = 200, message = "Dirección del Cliente debe tener máximo 200 caracteres")
	@Column(name = "dir_cliente", nullable = true, length = 200 )
	private String dirCliente;
	
	@Size(max = 12, message = "Teléfono del Cliente debe tener máximo 12 caracteres")
	@Column(name = "fono_cliente", nullable = true, length = 12 )
	private String telCliente;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDirCliente() {
		return dirCliente;
	}

	public void setDirCliente(String dirCliente) {
		this.dirCliente = dirCliente;
	}

	public String getTelCliente() {
		return telCliente;
	}

	public void setTelCliente(String telCliente) {
		this.telCliente = telCliente;
	}

	
}
