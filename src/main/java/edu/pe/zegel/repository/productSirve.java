package edu.pe.zegel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pe.zegel.model.producto;


public interface productSirve extends JpaRepository<producto, Integer>{
    
}
