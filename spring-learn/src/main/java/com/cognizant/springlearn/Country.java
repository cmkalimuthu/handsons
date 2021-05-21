package com.cognizant.springlearn;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component
public class Country {

	@NotNull(message="should not be null")
	@Size(min=2,max=2,message="country code should be 2")
	private String code;
	private String name;
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	
	public Country() {
		LOGGER.debug("inside country constructor");
	}
	public String getCode() {
		LOGGER.debug("inside getCode getter");
		return code;
	}
	public void setCode(String code) {
		LOGGER.debug("inside setCode setter");
		this.code = code;
	}
	public String getName() {
		LOGGER.debug("inside getName getter");
		return name;
	}
	public void setName(String name) {
		LOGGER.debug("inside setName setter");
		this.name = name;
	}
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
	
}
