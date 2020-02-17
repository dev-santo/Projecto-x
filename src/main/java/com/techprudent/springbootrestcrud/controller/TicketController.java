package com.techprudent.springbootrestcrud.controller;

import com.techprudent.springbootrestcrud.model.Tickets;
import com.techprudent.springbootrestcrud.model.User;
import com.techprudent.springbootrestcrud.service.TicketService;
import com.techprudent.springbootrestcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findById(@PathVariable(value = "id")  Long id) {
		return new ResponseEntity<>(ticketService.findById(id), HttpStatus.OK);
	}


	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> save(@RequestBody Tickets tickets) {
		return new ResponseEntity<>(ticketService.create(tickets), HttpStatus.OK);
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<?> update(@RequestBody Tickets tickets) {
		return new ResponseEntity<>(ticketService.update(tickets), HttpStatus.OK);
	}

	@RequestMapping(value ="/findAll", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findAll() {
		return new ResponseEntity<>(ticketService.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value ="/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		ticketService.delete(id);
	}


}
