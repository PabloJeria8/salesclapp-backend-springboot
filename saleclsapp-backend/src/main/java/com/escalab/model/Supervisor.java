package com.escalab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="supervisor")
public class Supervisor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSupervisor;
	
	@Size(min = 20, max = 200, message = "Nombre del Supervisor debe tener máximo 200 caracteres")
	@Column(name = "nombre_supervisor", nullable = false, length = 200 )
	private String nombreSupervisor;
	
	@Size(max = 200, message = "Dirección del Supervisor debe tener máximo 200 caracteres")
	@Column(name = "dir_supervisor", nullable = true, length = 200 )
	private String dirSupervisor;
	
	@Size(max = 12, message = "Teléfono del Supervisor debe tener máximo 12 caracteres")
	@Column(name = "fono_supervisor", nullable = true, length = 12 )
	private String telSupervisor;

	public Integer getIdSupervisor() {
		return idSupervisor;
	}

	public void setIdSupervisor(Integer idSupervisor) {
		this.idSupervisor = idSupervisor;
	}

	public String getNombreSupervisor() {
		return nombreSupervisor;
	}

	public void setNombreSupervisor(String nombreSupervisor) {
		this.nombreSupervisor = nombreSupervisor;
	}

	public String getDirSupervisor() {
		return dirSupervisor;
	}

	public void setDirSupervisor(String dirSupervisor) {
		this.dirSupervisor = dirSupervisor;
	}

	public String getTelSupervisor() {
		return telSupervisor;
	}

	public void setTelSupervisor(String telSupervisor) {
		this.telSupervisor = telSupervisor;
	}
	
}
