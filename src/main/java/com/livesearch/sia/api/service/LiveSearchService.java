package com.livesearch.sia.api.service;

import java.util.List;

import com.livesearch.sia.api.model.Producto;

public interface LiveSearchService {

	public abstract List<Producto> buscarProducto(String producto); 
}
