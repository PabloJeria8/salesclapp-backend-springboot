package com.escalab.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.escalab.model.Producto;
import com.escalab.repo.ICompraProductoRepo;
import com.escalab.service.ICompraProductoService;

@Service
public class CompraProductoServiceImpl implements ICompraProductoService {
	
	@Autowired
	private ICompraProductoRepo repo;
	
	@Override
	public List<Producto> listarProductosPorVenta(Integer idventa) {
		return repo.listarProductosPorVenta(idventa);
	}

}
