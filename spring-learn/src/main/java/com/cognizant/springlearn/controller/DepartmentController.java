package com.cognizant.springlearn.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Department;
import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.service.DepartmentService;
import com.cognizant.springlearn.service.EmployeeService;
@RestController
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/department")
	public ArrayList<Department> getAllEmployees(){
		System.out.println(departmentService.getAllDepartment());
		return departmentService.getAllDepartment();
	}
	
}
