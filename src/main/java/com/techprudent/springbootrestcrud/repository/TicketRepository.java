package com.techprudent.springbootrestcrud.repository;

import com.techprudent.springbootrestcrud.model.Payment;
import com.techprudent.springbootrestcrud.model.Tickets;
import com.techprudent.springbootrestcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TicketRepository extends JpaRepository<Tickets, Long> {
       //User findUse;

    @Query(value = "SELECT * FROM tickets  as t INNER JOIN client  as c " +
            " ON t.id_client=c.id_client" +
            " INNER JOIN route as r" +
            " ON t.id_route=r.id_route;", nativeQuery = true)
    List<Tickets> getAllTickets();

}
