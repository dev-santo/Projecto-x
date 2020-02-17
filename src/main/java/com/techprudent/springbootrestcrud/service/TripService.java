package com.techprudent.springbootrestcrud.service;

import com.techprudent.springbootrestcrud.model.Trip;
import com.techprudent.springbootrestcrud.model.User;

import java.util.List;

public interface TripService {

	public void delete(long id) ;

	public Trip update(Trip trip);

	public Trip create(Trip trip) ;

	public Trip findById(long id) ;

	public List<Trip> findAll();

}
