package com.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;

import com.restapi.entity.Client;
import com.restapi.repository.ApiRepository;

@Component
public class ClientBusiness {
	@Autowired
	private ApiRepository repository;
	
	public void add(Client client) {
		repository.save(client);
	}
	
	public List<Client> findAll(){
		return repository.findAll();
	}
	
	public Client update(int id, Client client) {
		Client cln = repository.findById(id).get();
		cln.setfName(client.getfName());
		cln.setlName(client.getlName());
		return repository.save(cln);
	}
	public void delete(int id) {
		Client client = repository.findById(id).get();
		repository.delete(client);

	}
}
