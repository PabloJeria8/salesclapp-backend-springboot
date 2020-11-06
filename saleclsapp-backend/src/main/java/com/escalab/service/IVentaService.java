package com.escalab.service;

import java.util.List;
import com.escalab.dto.FiltroVentaDTO;
import com.escalab.model.Venta;

public interface IVentaService extends ICRUD<Venta> {

	List<Venta> buscar(FiltroVentaDTO filtro);
	
	List<Venta> buscarFecha (FiltroVentaDTO filtro);

}
