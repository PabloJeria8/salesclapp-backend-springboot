package com.escalab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	
	@ManyToOne
	@JoinColumn(name = "id_marca", nullable = false, foreignKey = @ForeignKey(name = "FK_producto_marca")) 
	private Marca marca;
	
	@Size(max = 200, message = "Descripción del Producto debe tener máximo 200 caracteres")
	@Column(name = "descripcion", nullable = false, length = 200 )
	private String descripcion;
	
	@Column(name = "valor_producto", nullable = false, length = 18 )
	private Double valorProducto;

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getValorProducto() {
		return valorProducto;
	}

	public void setValorProducto(Double valorProducto) {
		this.valorProducto = valorProducto;
	}
	
}
