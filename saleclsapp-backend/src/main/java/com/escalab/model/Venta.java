package com.escalab.model;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name="venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVenta;

	@ManyToOne
	@JoinColumn(name = "id_vendedor", nullable = false, foreignKey = @ForeignKey(name = "FK_venta_vendedor")) 
	private Vendedor vendedor;
	 
	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false, foreignKey = @ForeignKey(name = "FK_venta_cliente")) 
	private Cliente cliente;
	 
	@Column(name = "costo", nullable = false, length = 18 )
	private Double costo;
	
	private LocalDateTime fechaventa;
	
	@OneToMany(mappedBy = "venta", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<CompraProducto> detalleCompraProducto;

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public LocalDateTime getFechaventa() {
		return fechaventa;
	}

	public void setFechaventa(LocalDateTime fechaventa) {
		this.fechaventa = fechaventa;
	}

	public List<CompraProducto> getDetalleCompraProducto() {
		return detalleCompraProducto;
	}

	public void setDetalleCompraProducto(List<CompraProducto> detalleCompraProducto) {
		this.detalleCompraProducto = detalleCompraProducto;
	}
	
	
}
