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
	public Integer getIdventa() {
		return idventa;
	}
	public void setIdventa(Integer idventa) {
		this.idventa = idventa;
	}
	public Integer getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Set<DetalleVenta> getDetalleventa() {
		return detalleventa;
	}
	public void setDetalleventa(Set<DetalleVenta> detalleventa) {
		this.detalleventa = detalleventa;
	}

}
