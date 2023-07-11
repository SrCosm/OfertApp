package edu.pe.zegel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.pe.zegel.model.login;
import edu.pe.zegel.repository.LoginRepository;
import edu.pe.zegel.service.loginService;




@RestController
@RequestMapping("/Login")
public class loginController {
	
	@Autowired
	private LoginRepository lr;
	
    @Autowired
	private loginService as;
    
    @GetMapping("/Listar")
    public List<login> listarLogin(){
    	return lr.findAll();
    }

    @GetMapping("/Buscar")
	public login LoginP(@RequestHeader String nombreusuario, @RequestHeader String contrasena) {
		return as.Login(nombreusuario, contrasena);
	}
    
    @PostMapping("/Insertar")
	public String insertCliente(@RequestBody login c) {
		String msje=""; 
		try {
			as.insertarLogin(c);
			msje="Registrado ok";
		}
		catch(Exception ex) {
			msje="Error";
		}
		return msje;
	}
    
    @PostMapping("/Insertar/Android")
	public String insertarCliente(Integer idusuario, String nombreusuario, String contrasena, String dni) {
		login c;
		String msje = "";
		try {
			c = new login(idusuario,nombreusuario,contrasena,dni);
			as.insertarLogin(c);
			msje = "Producto Registrado OK";
		} catch (Exception ex) {
			msje = "Error";
		}
		return msje;
	}
}