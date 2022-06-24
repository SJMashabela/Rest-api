package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.restapi.entity.Client;
import com.restapi.service.ClientBusiness;

@RestController

public class ClientController {
	@Autowired
	private ClientBusiness logic;

	@PostMapping("/addUser")
	public void add(@RequestBody Client client) {
		logic.add(client);
		System.out.println("Client Saved");
	}

	@GetMapping("/listAll")
	public List<Client> findAll() {
		System.out.println("All users");
		return logic.findAll();
	}

	@PatchMapping("/update/{id}")
	public Client update(@PathVariable(value = "id") int id, @RequestBody Client client) {
		System.out.println("Updated");
		return logic.update(id, client);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(value = "id") int id) {
		logic.delete(id);
		System.out.println("Deleted");
	}

}
//, value = "", produces = MediaType.APPLICATION_JSON_VALUE