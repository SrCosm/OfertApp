package edu.pe.zegel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import edu.pe.zegel.model.cliente;
import jakarta.transaction.Transactional;

public interface ClienteRepository extends JpaRepository<cliente, String>{
	@Transactional
    @Modifying
    @Query(value = "insert into cliente(dni,nombre,apellidos,correo,ruc,celular) values(:dni,:nombre,:apellidos,:correo,:ruc,:celular)",nativeQuery = true)
	public void insertarCliente( @Param ("dni")String dni, @Param ("nombre")String nombre,@Param ("apellidos")String apellidos, @Param ("correo")String correo, @Param ("ruc")String ruc,@Param ("celular") String celular);
}
