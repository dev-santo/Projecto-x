package com.techprudent.springbootrestcrud.repository;

import com.techprudent.springbootrestcrud.model.Client;
import com.techprudent.springbootrestcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
       //User findUse;
}
