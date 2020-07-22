package com.livesearch.sia.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.livesearch.sia.api.model.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
	
	@Query("SELECT p FROM Producto p WHERE p.nomProducto LIKE %?#{[0].toUpperCase()}%")
	public List<Producto> findByProductos(String product);
}
