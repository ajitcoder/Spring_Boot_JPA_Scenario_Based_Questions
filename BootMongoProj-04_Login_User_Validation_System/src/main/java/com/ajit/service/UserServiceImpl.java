package com.ajit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajit.document.User;
import com.ajit.repository.IUserRepository;
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository userRepo;
	
	@Override
	public String addUser(User user) {
		
		User save = userRepo.save(user);
		return "New User is Added with ID: "+save.getId();
	}

	@Override
	public User findUserByName(String name) {
		
		User userByName = userRepo.findByUsername(name);
		
		return userByName;
	}

	@Override
	public User findUserByEmail(String email) {
		
		return userRepo.findByEmail(email);
	}

	@Override
	public boolean existsByUsername(String username) {
		
		return userRepo.existsByUsername(username);
	}

	@Override
	public boolean existsByEmail(String email) {
		
		return userRepo.existsByEmail(email);
	}

	
}