package com.livesearch.sia.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.livesearch.sia.api.model.Producto;
import com.livesearch.sia.api.service.LiveSearchService;

@RestController
public class LiveSearchController {
	
	
	@Autowired
	LiveSearchService lvs;
	
	@RequestMapping(value = "/product/{producto}", method = RequestMethod.GET)
	public ResponseEntity<List<Producto>> getProducto(@PathVariable("producto") final String prod) {
		return ResponseEntity.ok(lvs.buscarProducto(prod));
	}
}
