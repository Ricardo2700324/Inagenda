package com.ricardo.agenda.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ricardo.agenda.dto.ClienteDTO;
import com.ricardo.agenda.entities.Cliente;
import com.ricardo.agenda.repositories.ClienteRepository;
import com.ricardo.agenda.services.exceptions.ResourceNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	@Transactional(readOnly = true)
	public ClienteDTO findId(Integer id) {
		Optional<Cliente> obj = repository.findById(id);
		Cliente entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not Found"));
		return new ClienteDTO(entity);

	}

}
