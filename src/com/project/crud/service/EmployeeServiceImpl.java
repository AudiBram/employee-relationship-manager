package com.project.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.crud.dao.EmployeeDAO;
import com.project.crud.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	@Transactional
	public List<Employee> getEmployees() {
		
		return employeeDAO.getEmployees();
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		
		employeeDAO.saveEmployee(employee);
	}

	@Override
	@Transactional
	public Employee getEmployee(int theId) {

		return employeeDAO.getEmployee(theId);
	}

	@Override
	@Transactional
	public void delete(int theId) {
		
		employeeDAO.delete(theId);
	}

}
