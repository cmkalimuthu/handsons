package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

import antlr.collections.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER=LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;
	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(OrmLearnApplication.class, args);
		countryService=context.getBean(CountryService.class);
		LOGGER.info("INSIDE MAIN");
		testGetAllountries();
	}
	private static void testGetAllountries() {
	  LOGGER.info("Start");
	 java.util.List<Country> countries = countryService.getAllCountries();
	 LOGGER.debug("Countries={}",countries);
	 LOGGER.info("End");
	}

}
