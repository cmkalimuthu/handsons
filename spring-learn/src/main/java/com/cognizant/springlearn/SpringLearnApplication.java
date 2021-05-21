package com.cognizant.springlearn;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@ComponentScan("com.*")
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		displayDate();
		displayCountry();
		displayCountries();
		displayEmployees();
		displayDepartment();
	}

	private static void displayDepartment() {

		LOGGER.info("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("department.xml");
		@SuppressWarnings("unchecked")
		ArrayList<Employee>department= (ArrayList<Employee>) context.getBean("department");
		LOGGER.debug("department "+department);
		LOGGER.info("End");
		
	}

	private static void displayCountries() {
		LOGGER.info("Start");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

	   
		@SuppressWarnings("unchecked")
		ArrayList<Country> countries = (ArrayList<Country>) context.getBean("countryList");
		for(Country c:countries) {
			LOGGER.info(c.getCode()+" "+c.getName());
		}
		
		
	

	}

	private static void displayCountry() {
		LOGGER.info("Start");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = (Country) context.getBean("country", Country.class);

		LOGGER.debug("Country : {}", country.toString());
		LOGGER.info("End");
	}

	private static void displayDate() {

		LOGGER.info("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		Date date = new Date();
		LOGGER.debug(format.format(date));
		LOGGER.info("End");

	}
	private static void displayEmployees() {

		LOGGER.info("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		@SuppressWarnings("unchecked")
		ArrayList<Employee>employees= (ArrayList<Employee>) context.getBean("employees");
		LOGGER.debug("employees "+employees);
		LOGGER.info("End");

	}
	

}
