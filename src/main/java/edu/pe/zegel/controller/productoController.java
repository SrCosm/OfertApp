package edu.pe.zegel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pe.zegel.model.producto;
import edu.pe.zegel.service.productoService;

@RestController
@RequestMapping("/Producto")
public class productoController {
	@Autowired
	private productoService cs;


	// Listar Cursos

	//Insertar Curso Android
	@PostMapping("/Insertar")
	public String insertarProducto(String idproducto, String idcat, String nombre, Double precio, Double stock, String ruc) {
		producto c;
		String msje = "";
		try {
			c = new producto(idproducto, idcat, nombre, precio,stock,ruc);
			cs.insertarProducto(c);
			msje = "Producto Registrado OK";
		} catch (Exception ex) {
			msje = "Error";
		}
		return msje;
	}

	// Actualizar producto Android
	@PutMapping("/Modificar")
	public String actualizarProducto(String idproducto, String idcat, String nombre, Double precio, Double stock, String ruc) {
		producto C;
		String msje = "";
		try {
			C = new producto(idproducto, idcat, nombre, precio,stock,ruc);
			cs.ActualizarProducto(C);
			msje = "producto Actualizado OK";
		} catch (Exception ex) {
			msje = "Error";
		}
		return msje;
	}

	// Eliminar Curso Android
	@DeleteMapping("/eliminar")
	public String eliminarProducto(String idproducto) {
		String msje = "";
		try {
			cs.eLiminarProducto(idproducto);
			msje = "Eliminado Correctamente";
		} catch (Exception e) {
			msje = "Error";
		}
		return msje;
	}
    @GetMapping("/Buscar/{nombre}")
	public producto getproductoxnombre(@PathVariable String nombre) {
		return cs.ObtenerProducto(nombre);	
	}

}
