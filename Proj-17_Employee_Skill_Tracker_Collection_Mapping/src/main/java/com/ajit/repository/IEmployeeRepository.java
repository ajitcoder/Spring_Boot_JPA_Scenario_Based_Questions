package com.ajit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajit.entity.EmployeeInfo;

public interface IEmployeeRepository extends JpaRepository<EmployeeInfo, Long> {

}