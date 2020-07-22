package com.livesearch.sia.api.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livesearch.sia.api.model.Producto;
import com.livesearch.sia.api.repository.ProductoRepository;
import com.livesearch.sia.api.service.LiveSearchService;

@Service
public class LiveSearchServiceImpl implements LiveSearchService {
	
	@Autowired
	private ProductoRepository repo;

	@Override
	public List<Producto> buscarProducto(String product) {
		return repo.findByProductos(product);
	}
}
