package com.escalab.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.escalab.model.Producto;
import com.escalab.service.ICompraProductoService;

@RestController
@RequestMapping("/compraproductos")
public class CompraProductoController {
	
	@Autowired
	private ICompraProductoService service;
	
	@GetMapping(value = "/{idVenta}")
	public ResponseEntity<List<Producto>> listar(@PathVariable("idVenta") Integer idventa) {
		List<Producto> producto = new ArrayList<>();
		producto = service.listarProductosPorVenta(idventa);
		
		return new ResponseEntity<List<Producto>>(producto, HttpStatus.OK);	
	}

}
