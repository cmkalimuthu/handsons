package com.cognizant.springlearn;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	@NotNull(message="id should be not null")
	@Digits(fraction = 0, integer = 1,message="should be a one digit number")
	private int id;
	@NotNull(message="should not be null")
	@NotEmpty(message=" should not be blank")
	@Size(min=1,max=30,message=" minimum 1 character and maximum 30 characters")
	private String name;
	@NotNull(message="should not be null")
	@Min(value=0,message=" should zero or above ")
	private double salary;
	@NotNull
	private boolean permanent;
	public Employee() {
		
	}
	public Employee(int id, String name, double salary, boolean permanent) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.permanent = permanent;
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
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isPermanent() {
		return permanent;
	}
	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent + "]";
	}
}
