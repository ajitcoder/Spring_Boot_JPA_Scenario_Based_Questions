package com.ajit.service;

import org.springframework.data.domain.Page;

import com.ajit.entity.Employee;

public interface IEmployeeMgmtService {

	String addEmployee(Employee employee);
	
	Page<Employee> getEmployeesByPaginationAndSorting(int pageNo, int pageSize, boolean ascOrder,
			String... props);	
}