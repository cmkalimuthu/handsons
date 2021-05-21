package com.cognizant.springlearn.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.springlearn.Department;
import com.cognizant.springlearn.Employee;
@Component
public class DepartmentDao {

	@Autowired
	private static ArrayList<Department> departmentList;

	public DepartmentDao(){
		
		
	}
	public static ArrayList<Department> getDepartmentList() {
		return departmentList;
	}

	public static void setDepartmentList(ArrayList<Department> departmentList) {
		DepartmentDao.departmentList = departmentList;
	}
	
	public ArrayList<Department> getAllDepartment(){
		return departmentList;
	}
	
}
