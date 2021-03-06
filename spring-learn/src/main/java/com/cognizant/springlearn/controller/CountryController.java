package com.cognizant.springlearn.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.Exception.CountryNotFoundException;
import com.cognizant.springlearn.service.CountryService;

@RestController
@Component
@RequestMapping("/countries")
public class CountryController {
	@Autowired
	private CountryService countryService;
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	// to return country india
	@GetMapping("/country")
	public Country country() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = (Country) context.getBean("country", Country.class);

		return country;
	}

	// to display list of countries
	@SuppressWarnings("unchecked")
	@GetMapping
	public ArrayList<Country> countries() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> countries = (ArrayList<Country>) context.getBean("countryList");

		return countries;
	}

	@GetMapping("/{code}")
	public Country getCountry(@PathVariable("code") String code) throws CountryNotFoundException {
		return countryService.getCountry(code);
	}

	@PostMapping()
	public Country addCountry(@RequestBody @Valid Country country) {
		LOGGER.info("indide add country");
		// Create validator factory
		return country;
	}
//	@PostMapping
//	public Country addCountry(@RequestBody Country country) {
//		LOGGER.info("Started the POST request");
//		LOGGER.debug("Country details: " + country);
//		// Create validator factory
//		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//		Validator validator = factory.getValidator();
//		// Validation is done against the annotations defined in country bean
//		Set<ConstraintViolation<Country>> violations = validator.validate(country);
//		List<String> errors = new ArrayList<String>();
//		// Accumulate all errors in an ArrayList of type String
//		for (ConstraintViolation<Country> violation : violations) {
//			errors.add(violation.getMessage());
//		}
//		// Throw exception so that the user of this web service receives appropriate
//		// error message
//		if (violations.size() > 0) {
//			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, errors.toString());
//		}
//		return country;
//	}
}
