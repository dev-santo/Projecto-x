package com.techprudent.springbootrestcrud.impl;

import com.techprudent.springbootrestcrud.model.User;
import com.techprudent.springbootrestcrud.repository.UserRepository;
import com.techprudent.springbootrestcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void delete(long id) {
		userRepository.deleteById(id);
	}

	@Override
	public User update(User user) {
		return userRepository.save(user);
	}

	@Override
	public User create(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findById(long id) {
		return null;
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

}
