package com.techprudent.springbootrestcrud.repository;

import com.techprudent.springbootrestcrud.model.Payment;
import com.techprudent.springbootrestcrud.model.TypePayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypePaymentRepository extends JpaRepository<TypePayment, Long> {
       // Payment findEventoById(Long id);
}
