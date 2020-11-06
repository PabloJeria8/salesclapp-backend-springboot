package com.escalab.dto;

import org.springframework.hateoas.ResourceSupport;
import com.escalab.model.Cliente;
import com.escalab.model.Vendedor;

public class VentaDTO extends ResourceSupport {
	
	private Integer idVenta;
	private Cliente cliente;
	private Vendedor vendedor;	
	
	
	public Integer getIdVenta() {
		return idVenta;
	}
	
	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

}
