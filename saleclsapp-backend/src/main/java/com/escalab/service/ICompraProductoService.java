package com.escalab.service;

import java.util.List;
import com.escalab.model.Producto;

public interface ICompraProductoService {
	
	List<Producto> listarProductosPorVenta(Integer idVenta);

}
