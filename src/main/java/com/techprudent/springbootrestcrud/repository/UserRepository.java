package com.techprudent.springbootrestcrud.repository;

import com.techprudent.springbootrestcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
       //User findUse;
}
