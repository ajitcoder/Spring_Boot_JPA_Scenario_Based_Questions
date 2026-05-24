package com.ajit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajit.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}