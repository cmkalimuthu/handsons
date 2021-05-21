package com.cognizant.springlearn;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class Department {

	@NotNull(message="should not be null")
	private int id;
	@NotNull(message="should not be null")
	@NotEmpty(message="should not be empty")
	@Min(value=1,message="minimum one character should be there")
	private String name;
	
	public Department() {
		
	}
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
