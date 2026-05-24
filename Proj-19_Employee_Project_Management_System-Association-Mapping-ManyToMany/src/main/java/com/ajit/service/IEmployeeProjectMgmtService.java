package com.ajit.service;

import java.util.List;

import com.ajit.entity.Employee;
import com.ajit.entity.Project;

public interface IEmployeeProjectMgmtService {

	String addEmployees(List<Employee> employees);
	String addProjects(List<Project> projects);
	
	String assignOneEmployeeToMulProjects(Integer empId, List<Integer> projectIds);
	String assignOneProjectToMulEmployees(Integer projectId, List<Integer> employeeIds);
	
	List<Employee> showEmployeesWithTheirProjects();
	List<Project> showProjectsWithAssignedEmployees();
}