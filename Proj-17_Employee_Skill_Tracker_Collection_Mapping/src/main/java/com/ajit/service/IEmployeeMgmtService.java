package com.ajit.service;

import java.util.List;

import com.ajit.entity.EmployeeInfo;

public interface IEmployeeMgmtService {

	String addNewEmployee(EmployeeInfo empInfo);
	List<EmployeeInfo> showAllEmplyeesInfo();
	EmployeeInfo fetchEmployeeInfoById(long id);
	String deleteEmployeeInfoById(long id);
}