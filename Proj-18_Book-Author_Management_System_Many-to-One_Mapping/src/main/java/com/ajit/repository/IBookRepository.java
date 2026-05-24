package com.ajit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajit.entity.Book;

public interface IBookRepository extends JpaRepository<Book, Integer> {

	long countByAuthorAid(Integer aid);}