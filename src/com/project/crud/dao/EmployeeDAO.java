package com.project.crud.dao;

import java.util.List;

import com.project.crud.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getEmployees();

	public void saveEmployee(Employee employee);

	public Employee getEmployee(int theId);

	public void delete(int theId);
	

}
