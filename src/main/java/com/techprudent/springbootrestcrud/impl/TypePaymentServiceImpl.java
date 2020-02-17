package com.techprudent.springbootrestcrud.impl;

import com.techprudent.springbootrestcrud.model.Payment;
import com.techprudent.springbootrestcrud.model.TypePayment;
import com.techprudent.springbootrestcrud.repository.PaymentRepository;
import com.techprudent.springbootrestcrud.repository.TypePaymentRepository;
import com.techprudent.springbootrestcrud.service.PaymentService;
import com.techprudent.springbootrestcrud.service.TypePaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePaymentServiceImpl implements TypePaymentService {

	@Autowired
	private TypePaymentRepository typepaymentRepository;
	
	@Override
	public void delete(long id) {
		typepaymentRepository.deleteById(id);
	}

	@Override
	public TypePayment update(TypePayment typePayment) {
		return typepaymentRepository.save(typePayment);
	}

	@Override
	public TypePayment create(TypePayment typePayment) {
		return typepaymentRepository.save(typePayment);
	}

	@Override
	public TypePayment findById(long id) {
		return null;
	}

	@Override
	public List<TypePayment> findAll() {
		return typepaymentRepository.findAll();
	}

}
