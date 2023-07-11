package edu.pe.zegel.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import edu.pe.zegel.model.login;
import edu.pe.zegel.repository.LoginRepository;

@Service
public class loginService {
    @Autowired 
    private LoginRepository lr;

    public login Login(String nombreusuario, String contrasena) {
		return lr.LoginP(nombreusuario, contrasena);
	}
    
    public void insertarLogin(login l) {
    	lr.insertarCliente(l.getNombreusuario(), l.getContrasena(),l.getDni());
    }
}
