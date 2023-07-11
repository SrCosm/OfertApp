package edu.pe.zegel.repository;


import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import edu.pe.zegel.model.producto;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductoRepository extends JpaRepository<producto, String>{

   
    //buscar por id
	@Query(value="select * from producto where nombre=:nombre", nativeQuery = true)
	public producto buscarProducto(@Param("nombre")String nombre);
    //insertar
	@Transactional
    @Modifying
    @Query(value = "insert into producto(id_cat,nombre,precio,stock,ruc) values(:id_cat,:nombre,:precio,:stock,:ruc)",nativeQuery = true)
	public void insertarProducto( @Param ("id_cat")String id_cat, @Param ("nombre")String nombre,@Param ("precio")Double precio, @Param ("stock")Double stock, @Param ("ruc")String rucproveedor);
    //modificar 
	@Transactional
    @Modifying
    @Query(value = "update producto set id_cat=:id_cat, nombre=:nombre, precio=:precio, stock=:stock, ruc=:ruc where idproducto=:idproducto",nativeQuery = true)
	public void  modificarProducto(@Param ("idproducto")String idproducto, @Param ("id_cat")String id_cat, @Param ("nombre")String nombre,@Param ("precio")Double precio, @Param ("stock")Double stock, @Param ("ruc")String rucproveedor);
    //eliminar 
    @Transactional
	@Modifying
	@Query(value = "delete from producto where idproducto=:idproducto",nativeQuery = true)
	public void eliminarProducto(@Param("idproducto") String idproducto);	
}