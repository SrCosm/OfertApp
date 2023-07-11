package edu.pe.zegel.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class producto{

    @Id
	@Column(name="idproducto")    
    private String idproducto;
    @Column(name="id_cat")
    private String id_cat;
    @Column(name="nombre")
    private String nombre;
    @Column(name="precio")
    private Double precio;
    @Column(name="stock")
    private Double stock;
    @Column(name="ruc")
    private String ruc;
	public producto(String idproducto, String id_cat, String nombre, Double precio, Double stock, String ruc) {
		super();
		this.idproducto = idproducto;
		this.id_cat = id_cat;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.ruc = ruc;
	}
	public producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(String idproducto) {
		this.idproducto = idproducto;
	}
	public String getId_cat() {
		return id_cat;
	}
	public void setId_cat(String id_cat) {
		this.id_cat = id_cat;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Double getStock() {
		return stock;
	}
	public void setStock(Double stock) {
		this.stock = stock;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	
    	

        
}
