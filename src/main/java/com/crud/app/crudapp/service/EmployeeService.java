package com.crud.app.crudapp.service;

import java.util.List;

import com.crud.app.crudapp.modal.Employee;

public interface EmployeeService {
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
