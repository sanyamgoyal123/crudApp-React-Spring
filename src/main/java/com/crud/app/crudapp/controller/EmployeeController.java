package com.crud.app.crudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.app.crudapp.modal.Employee;
import com.crud.app.crudapp.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping("/employee")
	public List<Employee> get() {
		return employeeservice.get();
	}
	
	@PostMapping("/employee")
	public Employee save(@RequestBody Employee employee) {
		employeeservice.save(employee);
		return employee;
	}
	
	@GetMapping("/employee/{id}")
	public Employee get(@PathVariable int id) {
		return employeeservice.get(id);
	}
	
	@DeleteMapping("/employee/{id}")
	public String delete(@PathVariable int id) {
		employeeservice.delete(id);
		return "Employee deleted with id : " + id + ".";
	}
	
	@PutMapping("/employee")
	public Employee update(@RequestBody Employee employee) {
		employeeservice.save(employee);
		return employee;
	}
}
