package edu.pe.zegel.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.zegel.model.producto;
import edu.pe.zegel.repository.ProductoRepository;

@Service
public class productoService{

@Autowired
	private ProductoRepository cr;

	public List < producto > aa() {
        return cr.findAll();
    }
	public void insertarProducto(producto p) {
		cr.insertarProducto(p.getId_cat(), p.getNombre(), p.getPrecio(),p.getStock(),p.getRuc());
	}
	
	public producto ObtenerProducto(String nombre) {
		return cr.buscarProducto(nombre);
	}
	
	public void ActualizarProducto(producto p) {
		cr.modificarProducto(p.getIdproducto(), p.getId_cat(), p.getNombre(), p.getPrecio(),p.getStock(),p.getRuc());
	}
	
	public void eLiminarProducto(String idproducto) {
		cr.eliminarProducto(idproducto);
	}
}