package com.escalab.repo;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.escalab.model.Venta;

public interface IVentaRepo extends JpaRepository<Venta, Integer> {
	
	@Query("from Venta c where c.cliente.idCliente =:idCliente or LOWER(c.cliente.nombreCliente) like %:nombreCliente%")
	List<Venta> buscar(@Param("idCliente")Integer idCliente, @Param("nombreCliente") String nombreCliente);

	@Query("from Consulta c where c.fechaVenta between :fechaVenta and :fechaSgte")
	List<Venta> buscarFecha(@Param("fechaVenta") LocalDateTime fechaVenta, @Param("fechaSgte") LocalDateTime fechaSgte);

}
