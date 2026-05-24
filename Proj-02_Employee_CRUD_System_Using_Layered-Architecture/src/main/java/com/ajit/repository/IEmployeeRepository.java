package com.ajit.repository;

import org.springframework.data.repository.CrudRepository;

import com.ajit.entity.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {

	
}