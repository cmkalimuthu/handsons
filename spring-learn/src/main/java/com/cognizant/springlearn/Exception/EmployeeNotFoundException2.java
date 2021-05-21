package com.cognizant.springlearn.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Employee not found")
public class EmployeeNotFoundException2 extends Exception {

	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException2() {
	}

	

}
