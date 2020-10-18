package com.soaint.pruebasoaint.modelo;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;



@Entity
@Table(name="detalleventa")
public class DetalleVenta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iddetalleventa;
	
	private Integer idventa;
	private Integer idproducto;
	
	

}
