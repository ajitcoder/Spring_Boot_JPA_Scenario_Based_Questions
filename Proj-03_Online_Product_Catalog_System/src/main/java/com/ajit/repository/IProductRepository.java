package com.ajit.repository;

import org.springframework.data.repository.CrudRepository;

import com.ajit.entity.Product;

public interface IProductRepository extends CrudRepository<Product,Integer> {

}