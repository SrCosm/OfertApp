package edu.pe.zegel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pe.zegel.model.cliente;
import edu.pe.zegel.repository.ClienteRepository;
import edu.pe.zegel.service.clienteService;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {
	@Autowired
	private clienteService cs;
	
	@Autowired
	private ClienteRepository cr;
	
	@GetMapping("/Listar")
	public List<cliente> getClientes(){
		return cr.findAll();
	}
	
	@PostMapping("/Insertar")
	public String insertCliente(@RequestBody cliente c) {
		String msje=""; 
		try {
			cs.insertarCliente(c);
			msje="Registrado ok";
		}
		catch(Exception ex) {
			msje="Error";
		}
		return msje;
	}
	
	@PostMapping("/Insertar/Android")
	public String insertarCliente(String dni, String nombre, String apellidos, String correo, String ruc, String celular) {
		cliente c;
		String msje = "";
		try {
			c = new cliente(dni, nombre, apellidos,correo,ruc,celular);
			cs.insertarCliente(c);
			msje = "Producto Registrado OK";
		} catch (Exception ex) {
			msje = "Error";
		}
		return msje;
	}
}
