package com.cognizant.springlearn.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Department;
import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.dao.DepartmentDao;
import com.cognizant.springlearn.dao.EmployeeDao;

@Service
public class DepartmentService {
	@Autowired
	DepartmentDao departmentDao;
	
	
	public ArrayList<Department> getAllDepartment(){
		return departmentDao.getAllDepartment();
	}

}
