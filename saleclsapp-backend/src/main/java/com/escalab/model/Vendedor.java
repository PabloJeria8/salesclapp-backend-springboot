package com.escalab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.persistence.ForeignKey;

@Entity
@Table(name="vendedor")
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVendedor;
	
	@ManyToOne
	@JoinColumn(name = "id_supervisor", nullable = false, foreignKey = @ForeignKey(name = "FK_vendedor_supervisor")) 
	private Supervisor supervisor;
	
	@Size(min = 20, max = 200, message = "Nombre del Vendedor debe tener máximo 200 caracteres")
	@Column(name = "nombre_vendedor", nullable = false, length = 200 )
	private String nombreVendedor;
	
	@Size(max = 200, message = "Dirección del Vendedor debe tener máximo 200 caracteres")
	@Column(name = "dir_vendedor", nullable = true, length = 200 )
	private String dirVendedor;

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}

	public String getDirVendedor() {
		return dirVendedor;
	}

	public void setDirVendedor(String dirVendedor) {
		this.dirVendedor = dirVendedor;
	}
	
}
