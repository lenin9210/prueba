package com.soaint.pruebasoaint.controlador;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class Producto {

	public String getAll() {
		return "";
	}
}
