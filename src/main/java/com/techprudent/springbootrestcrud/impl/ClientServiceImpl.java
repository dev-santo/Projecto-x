package com.techprudent.springbootrestcrud.impl;

import com.techprudent.springbootrestcrud.model.Client;
import com.techprudent.springbootrestcrud.model.User;
import com.techprudent.springbootrestcrud.repository.ClientRepository;
import com.techprudent.springbootrestcrud.repository.UserRepository;
import com.techprudent.springbootrestcrud.service.ClientService;
import com.techprudent.springbootrestcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public void delete(long id) {
		clientRepository.deleteById(id);
	}

	@Override
	public Client update(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Client create(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Client findById(long id) {
		return null;
	}

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

}
