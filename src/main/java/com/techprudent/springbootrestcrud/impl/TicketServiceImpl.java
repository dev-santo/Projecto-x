package com.techprudent.springbootrestcrud.impl;

import com.techprudent.springbootrestcrud.model.Tickets;
import com.techprudent.springbootrestcrud.repository.TicketRepository;
import com.techprudent.springbootrestcrud.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository ticketRepository;
	
	@Override
	public void delete(long id) {
		ticketRepository.deleteById(id);
	}

	@Override
	public Tickets update(Tickets tickets) {
		return ticketRepository.save(tickets);
	}

	@Override
	public Tickets create(Tickets tickets) {
		return ticketRepository.save(tickets);
	}

	@Override
	public Tickets findById(long id) {
		return null;
	}

	@Override
	public List<Tickets> findAll() {
		return ticketRepository.getAllTickets();
	}

}
