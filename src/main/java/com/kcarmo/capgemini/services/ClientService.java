package com.kcarmo.capgemini.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kcarmo.capgemini.domain.Client;
import com.kcarmo.capgemini.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repoClient;

	public Client findOne(Integer id) {
		Optional<Client> obj = repoClient.findById(id);
		
		return obj.orElse(null); 
	}
}
