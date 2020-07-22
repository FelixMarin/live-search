package com.livesearch.sia.api.vo;

import org.springframework.stereotype.Component;

@Component
public class ProductoVO {
	
	private int id;
	private String nomProducto;
	
	public ProductoVO() {
		super();
	}
	
	public ProductoVO(int id, String nomProducto) {
		super();
		this.id = id;
		this.nomProducto = nomProducto;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNomProducto() {
		return nomProducto;
	}
	
	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}
}
