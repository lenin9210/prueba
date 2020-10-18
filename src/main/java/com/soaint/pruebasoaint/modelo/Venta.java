package com.soaint.pruebasoaint.modelo;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;



@Entity
@Table(name="venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idventa;
	
	private Integer idcliente;
	private LocalDateTime fecha;
	//private String fecha;
	@OneToMany(mappedBy="detalleventa")
	private Set<DetalleVenta> detalleventa;

}
