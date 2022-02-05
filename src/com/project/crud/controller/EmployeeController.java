package com.project.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.crud.dao.EmployeeDAO;
import com.project.crud.entity.Employee;
import com.project.crud.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/list")
	public String listEmployees(Model model) {
		
		List<Employee> theEmployee = employeeService.getEmployees();
		
		model.addAttribute("employee", theEmployee);
		
		return "list-employees";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		
		Employee employee = new Employee();
		
		model.addAttribute("employee", employee);
		
		return "employee-form";
	}
	
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		
		// save employee
		employeeService.save(employee);
		
		return "redirect:/employee/list";
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId, Model model) {
		
		Employee theEmployee = employeeService.getEmployee(theId);
		
		model.addAttribute("employee", theEmployee);
		
		return "employee-form";
	}

	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId") int theId) {
		
		// delete employee
		employeeService.delete(theId);
		
		return "redirect:/employee/list";
	}
}







