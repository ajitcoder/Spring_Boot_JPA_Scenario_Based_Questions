package com.ajit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ajit.document.User;

public interface IUserRepository extends MongoRepository<User, String> {

	User findByUsername(String name);
	User findByEmail(String email);
	
	boolean existsByUsername(String username);
	boolean existsByEmail(String email);

}