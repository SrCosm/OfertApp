package edu.pe.zegel.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class login {
@Id
private int idusuario;
@Column(name="nombreusuario")
private String nombreusuario;
@Column(name="contrasena")
private String contrasena;
@Column(name="dni")
private String dni;
public login() {
	super();
	// TODO Auto-generated constructor stub
}
public login(int idusuario, String nombreusuario, String contrasena, String dni) {
	super();
	this.idusuario = idusuario;
	this.nombreusuario = nombreusuario;
	this.contrasena = contrasena;
	this.dni = dni;
}
public int getIdusuario() {
	return idusuario;
}
public void setIdusuario(int idusuario) {
	this.idusuario = idusuario;
}
public String getNombreusuario() {
	return nombreusuario;
}
public void setNombreusuario(String nombreusuario) {
	this.nombreusuario = nombreusuario;
}
public String getContrasena() {
	return contrasena;
}
public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}


}