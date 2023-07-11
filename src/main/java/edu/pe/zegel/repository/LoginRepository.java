package edu.pe.zegel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import edu.pe.zegel.model.login;
import jakarta.transaction.Transactional;

public interface LoginRepository extends JpaRepository<login, Integer>{
    @Query(value = "select * from login where nombreusuario=:nombreusuario and contrasena=:contrasena",nativeQuery = true)
	public login LoginP(@Param("nombreusuario")String nombreusuario,@Param("contrasena")String contrasena);
    
    @Transactional
    @Modifying
    @Query(value = "insert into login(nombreusuario,contrasena,dni) values(:nombreusuario,:contrasena,:dni)",nativeQuery = true)
	public void insertarCliente( @Param ("nombreusuario")String nombreusuario,@Param ("contrasena")String contrasena, @Param ("dni")String dni);
}