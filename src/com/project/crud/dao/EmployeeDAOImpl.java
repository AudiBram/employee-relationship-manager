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
	public List<Employee> getEmployees() {
		
		// get current hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create query and sort by firstName
		Query<Employee> theQuery = currentSession.createQuery("from Employee order by firstName", Employee.class);
		
		// execute
		List<Employee> employees = theQuery.getResultList();
		
		// return results
		return employees;
	}


	@Override
	public void saveEmployee(Employee employee) {
		// get current hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		
		// saveOrUpdate employee
		currentSession.saveOrUpdate(employee);
		
	}


	@Override
	public Employee getEmployee(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Employee employee = currentSession.get(Employee.class, theId);
		
		return employee;
	}


	@Override
	public void delete(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = currentSession.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", theId);
		theQuery.executeUpdate();
	}

}




