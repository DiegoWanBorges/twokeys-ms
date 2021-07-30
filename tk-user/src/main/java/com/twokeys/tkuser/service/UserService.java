package com.twokeys.tkuser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.twokeys.tkuser.entities.User;
import com.twokeys.tkuser.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	@Transactional(readOnly = true)
	public User findByEmail(String email) {
		User entity = repository.findByEmail(email);
		return entity;
	}
}
