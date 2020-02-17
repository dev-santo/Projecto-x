package com.techprudent.springbootrestcrud.repository;

import com.techprudent.springbootrestcrud.model.Tickets;
import com.techprudent.springbootrestcrud.model.Trip;
import com.techprudent.springbootrestcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TripRepository extends JpaRepository<Trip, Long> {
    @Query(value = "SELECT * FROM trip as tri INNER JOIN  tickets as t" +
            " ON tri.id_trip=t.id_ticket" +
            " INNER JOIN payment as p" +
            " ON t.id_ticket=p.id_payment;", nativeQuery = true)
    List<Trip> getAllTrip();
}
