package com.project.crud.service;

import java.util.List;

import com.project.crud.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();

	public void save(Employee employee);

	public Employee getEmployee(int theId);

	public void delete(int theId);
	
}
