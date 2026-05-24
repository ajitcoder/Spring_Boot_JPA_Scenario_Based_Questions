package com.ajit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajit.entity.Product;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}