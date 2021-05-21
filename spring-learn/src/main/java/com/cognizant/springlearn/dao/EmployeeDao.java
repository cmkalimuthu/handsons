package com.cognizant.springlearn.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.Exception.EmployeeNotFoundException2;
@Component
public class EmployeeDao {

	@Autowired
	private static ArrayList<Employee> employeeList;

	public EmployeeDao(){
		
		
	}
	public static ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public static void setEmployeeList(ArrayList<Employee> employeeList) {
		EmployeeDao.employeeList = employeeList;
	}
	
	public ArrayList<Employee> getAllEmployees(){
		return employeeList;
	}
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException2 {
		for(Employee e:employeeList) {
			if(employee.getId()==e.getId()) {
				e.setName(employee.getName());
				e.setSalary(employee.getSalary());
				e.setPermanent(employee.isPermanent());
				return e;
			}
			
		}
		throw new EmployeeNotFoundException2();
	}
	public ArrayList<Employee> deleteEmployee(int id) throws EmployeeNotFoundException2{
		for(Employee e:employeeList) {
			if(id==e.getId()) {
				employeeList.removeIf(t -> t.getId() == id);
				return employeeList;
			}
	}
		throw new EmployeeNotFoundException2();
	}
	public Employee addEmployee(Employee employee) {
		employeeList.add(employee);
		return employee;
	}
	
}
