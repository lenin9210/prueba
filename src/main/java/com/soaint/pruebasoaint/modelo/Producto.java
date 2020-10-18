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
	
}
