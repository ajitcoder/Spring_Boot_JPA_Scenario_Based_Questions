package com.ajit.service;

import com.ajit.document.User;

public interface IUserService {

	String addUser(User user);
	User findUserByName(String name);
	User findUserByEmail(String email);
	
	boolean existsByUsername(String username);
	boolean existsByEmail(String email);

	
	
}