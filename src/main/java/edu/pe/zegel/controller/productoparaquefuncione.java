package edu.pe.zegel.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pe.zegel.model.producto;
import edu.pe.zegel.repository.ProductoRepository;
import edu.pe.zegel.service.productoService;


@RestController
@RequestMapping("/api/Producto")
public class productoparaquefuncione {
	@Autowired
	private productoService cs;

    @Autowired
	private ProductoRepository cr;

	// Listar Cursos
	@GetMapping("/Listar")
	public List<producto> getProductos(){
		return cr.findAll();
	}	
	//Insertar Curso Android
	@PostMapping("/Insertar")
	public String insertCurso(@RequestBody producto p) {
		String msje=""; 
		try {
			cs.insertarProducto(p);
			msje="Registrado ok";
		}
		catch(Exception ex) {
			msje="Error";
		}
		return msje;
	}

	// Actualizar producto Android
	@PutMapping("/Actualizar")
	public String updateCurso(@RequestBody producto p) {
		String msje="";
		try {
			cs.ActualizarProducto(p);
			msje="Actualizado ok";
		}
		catch(Exception ex) {
			msje="Error";
		}
		return msje;
	}

	// Eliminar Curso Android
	@DeleteMapping("/Eliminar/{id}")
	public String deleteCurso(@PathVariable String id) {
		String msje="";
		try {
			cs.eLiminarProducto(id);
			msje="Eliminado correctamente";
		}
		catch(Exception e) {
			msje="Error";
		}
		return msje;
	}
    @GetMapping("/Buscar/{nombre}")
	public producto getproductoxnombre(@PathVariable String nombre) {
		return cs.ObtenerProducto(nombre);	
	}

}
