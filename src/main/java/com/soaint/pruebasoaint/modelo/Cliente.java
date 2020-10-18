package com.soaint.pruebasoaint.modelo;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
//import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcliente;
	
	private String nombre;
	private String apellido;
	private String dni;
	private String telefono;
	private String email;
	
	@OneToMany(mappedBy="venta")
	private Set<Venta> venta;
	
	public Cliente() {
		
	}
	
	

}
