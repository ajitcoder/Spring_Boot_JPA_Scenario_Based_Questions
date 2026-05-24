package com.ajit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajit.entity.Author;

public interface IAuthorRepository extends JpaRepository<Author, Integer> {
}