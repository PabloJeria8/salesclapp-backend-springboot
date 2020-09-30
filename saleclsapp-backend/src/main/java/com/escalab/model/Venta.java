package com.escalab.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name="venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVenta;

	@ManyToOne
	@JoinColumn(name = "id_vendedor", nullable = false, foreignKey = @ForeignKey(name = "FK_venta_vendedor")) 
	private Vendedor vendedor;
	 
	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false, foreignKey = @ForeignKey(name = "FK_venta_cliente")) 
	private Cliente cliente;
	 
	@Column(name = "costo", nullable = false, length = 18 )
	private Double costo;
	
	private LocalDateTime fechaventa;
	
	
	
}
