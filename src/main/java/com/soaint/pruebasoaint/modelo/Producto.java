package com.soaint.pruebasoaint.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import lombok.Data;

@Entity
@Table(name="producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idproducto;
	
	private String nombre;
	private Double precio;
	
	@OneToMany(mappedBy="detalleventa")
	private Set<Venta> detalleventa;

	public Integer getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Set<Venta> getDetalleventa() {
		return detalleventa;
	}

	public void setDetalleventa(Set<Venta> detalleventa) {
		this.detalleventa = detalleventa;
	}
	
	
}
