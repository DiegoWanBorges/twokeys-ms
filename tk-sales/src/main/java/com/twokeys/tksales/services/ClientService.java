package com.twokeys.tksales.services;

import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twokeys.tksales.dto.ClientDTO;
import com.twokeys.tksales.entities.Client;
import com.twokeys.tksales.repositories.ClientRepository;

@Service
public class ClientService {
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly=true)
	public ClientDTO findById(Long id){
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new IllegalArgumentException ("Entity not found"));
		return new ClientDTO(entity);
	}
}
