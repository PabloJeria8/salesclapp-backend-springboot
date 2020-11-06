package com.escalab.dto;

import java.time.LocalDateTime;

public class FiltroVentaDTO {
	
	private Integer idCliente;
	private String nombreCliente;
	private LocalDateTime fechaVenta;
	
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
	
	public LocalDateTime getFechaVenta() {
		return fechaVenta;
	}
	
	public void setFechaVenta(LocalDateTime fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

}
