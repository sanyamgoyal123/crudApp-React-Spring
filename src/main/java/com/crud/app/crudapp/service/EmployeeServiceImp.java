package com.crud.app.crudapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.app.crudapp.dao.EmployeeDAO;
import com.crud.app.crudapp.modal.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	EmployeeDAO employeedao;
	
	@Transactional
	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
		return employeedao.get();
	}
	
	@Transactional
	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return employeedao.get(id);
	}
	
	@Transactional
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeedao.save(employee);
	}
	
	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		employeedao.delete(id);
	}
}
