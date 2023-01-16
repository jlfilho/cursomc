package com.jlfilho.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlfilho.cursomc.domain.Categoria;
import com.jlfilho.cursomc.domain.Cliente;
import com.jlfilho.cursomc.repositories.ClienteRepository;
import com.jlfilho.cursomc.service.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;


	public Cliente find(Integer id) {
		Optional<Cliente> obj = clienteRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}
