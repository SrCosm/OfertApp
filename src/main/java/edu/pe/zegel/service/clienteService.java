package edu.pe.zegel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.zegel.model.cliente;
import edu.pe.zegel.repository.ClienteRepository;

@Service
public class clienteService {
	
	@Autowired
	private ClienteRepository cr;
	
	public List < cliente > aa() {
        return cr.findAll();
    }
	
	public void insertarCliente(cliente c) {
		cr.insertarCliente(c.getDni(), c.getNombre(), c.getApellidos(),c.getCorreo(),c.getRuc(),c.getCelular());
	}
}
