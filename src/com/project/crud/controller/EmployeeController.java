package com.project.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.crud.dao.EmployeeDAO;
import com.project.crud.entity.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@RequestMapping("/list")
	public String listEmployees(Model model) {
		
		List<Employee> theEmployee = employeeDAO.getEmployees();
		
		model.addAttribute("employee", theEmployee);
		
		return "list-employees";
	}

}
