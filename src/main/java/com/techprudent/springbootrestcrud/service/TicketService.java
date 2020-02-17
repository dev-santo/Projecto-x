package com.techprudent.springbootrestcrud.service;

import com.techprudent.springbootrestcrud.model.Tickets;
import com.techprudent.springbootrestcrud.model.User;

import java.util.List;

public interface TicketService {

	public void delete(long id) ;

	public Tickets update(Tickets user);

	public Tickets create(Tickets user) ;

	public Tickets findById(long id) ;

	public List<Tickets> findAll();

}
