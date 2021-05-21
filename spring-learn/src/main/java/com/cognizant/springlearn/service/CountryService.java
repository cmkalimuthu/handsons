package com.cognizant.springlearn.service;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.Exception.CountryNotFoundException;
@Component
public class CountryService {
	public Country getCountry(String code) throws CountryNotFoundException{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		@SuppressWarnings("unchecked")
		ArrayList<Country> countries = (ArrayList<Country>) context.getBean("countryList");
		for(Country c:countries) {
			if(c.getCode().equalsIgnoreCase(code))
				return c;
		}
		throw new CountryNotFoundException();

	}

}
