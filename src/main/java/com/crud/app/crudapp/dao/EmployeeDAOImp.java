package com.crud.app.crudapp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.app.crudapp.modal.Employee;

@Repository
public class EmployeeDAOImp implements EmployeeDAO {
	
	@Autowired
	private EntityManager entitymanager;

	@Override
	public List<Employee> get() {
		Session currSession = entitymanager.unwrap(Session.class);
		//Query<Employee> query = currSession.createQuery("from employee", Employee.class);
		Query<Employee> query = currSession.createQuery("from Employee", Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee get(int id) {
		Session currSession = entitymanager.unwrap(Session.class);
		Employee e = currSession.get(Employee.class, id);
		return e;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		Session currSession = entitymanager.unwrap(Session.class);
		currSession.saveOrUpdate(employee);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session currSession = entitymanager.unwrap(Session.class);
		Employee e= currSession.get(Employee.class, id);
		currSession.delete(e);
	}

}
