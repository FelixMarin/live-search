package com.livesearch.sia.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;


/**
 * The persistent class for the tb_sia_nom_productos database table.
 * 
 *  @author Felix Marin Ramirez
 */
@Entity
@Table(name="tb_sia_nom_productos")
@NamedQuery(name="Producto.findAll", query="SELECT t FROM Producto t")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	public Producto(Integer did, String nomProducto) {
		super();
		this.did = did;
		this.nomProducto = nomProducto;
	}

	@Id
	@Column(name = "did")
	private Integer did;

	@Column(name="nom_producto")
	private String nomProducto;

	public Producto() {
		super();
	}

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getNomProducto() {
		return this.nomProducto;
	}

	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}
}