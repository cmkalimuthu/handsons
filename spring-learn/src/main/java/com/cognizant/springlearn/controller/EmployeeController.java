package com.cognizant.springlearn.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.Exception.EmployeeNotFoundException2;
import com.cognizant.springlearn.service.EmployeeService;
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public ArrayList<Employee> getAllEmployees(){
		System.out.println(employeeService.getAllEmployees());
		return employeeService.getAllEmployees();
	}
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody @Valid Employee employee) throws EmployeeNotFoundException2 {
		return employeeService.updateEmployee(employee);
	}
	@DeleteMapping("/employee/{id}")
	public ArrayList<Employee> deleteEmployee(@PathVariable int id) throws EmployeeNotFoundException2{
		return employeeService.deleteEmployee(id);
	}
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody @Valid Employee employee) {
		// Create validator factory
		return employeeService.addEmployee(employee);
	}
}
