package com.ricardo.agenda.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.agenda.dto.ClienteDTO;
import com.ricardo.agenda.services.ClienteService;

@RestController
@RequestMapping(value = "/clients")
public class ClienteResource {
	
	
	@Autowired
	private ClienteService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ClienteDTO> findId(@PathVariable Integer id){
		ClienteDTO dto = service.findId(id);	
		return ResponseEntity.ok().body(dto);
	}
	

}
