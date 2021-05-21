package com.cognizant.springlearn.service;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.Exception.EmployeeNotFoundException2;
import com.cognizant.springlearn.dao.EmployeeDao;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeeDao;

	
	public ArrayList<Employee> getAllEmployees(){
		return employeeDao.getAllEmployees();
	}
	public Employee updateEmployee(Employee emp) throws EmployeeNotFoundException2 {
		return employeeDao.updateEmployee(emp);
	}
	
	public ArrayList<Employee> deleteEmployee(int id) throws EmployeeNotFoundException2{
		return employeeDao.deleteEmployee(id);
	}
	public Employee addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
	}
	

}
