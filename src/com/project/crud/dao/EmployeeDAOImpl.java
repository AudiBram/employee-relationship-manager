package com.project.crud.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.crud.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	@Transactional
	public List<Employee> getEmployees() {
		
		// get current hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create query
		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);
		
		// execute
		List<Employee> employees = theQuery.getResultList();
		
		// return results
		return employees;
	}

}




