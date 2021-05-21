package com.cognizant.springlearn.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.jsonwebtoken.JwtBuilder;

import io.jsonwebtoken.Jwts;

import io.jsonwebtoken.SignatureAlgorithm;
import com.cognizant.springlearn.SpringLearnApplication;



@RestController
@RequestMapping("/countries")
public class AuthenticationController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	@GetMapping("/authenticate")
	public Map<String, String> getAuthenticate(@RequestHeader("Authorization") String authHeader) {
		
		LOGGER.info("Start");
		LOGGER.debug(authHeader);
		Map<String, String> token = new HashMap<String, String>();
		String passkey=generateJwt(getUser(authHeader));
		token.put("token",passkey);
		LOGGER.info("end");
		return token;
		
		
	}
	
	private String getUser(String authHeader) {
		byte[]check=Base64.getDecoder().decode("dXNlcjpwd2Q");
		String[] tostring= new String(check).split(":");
		String username=tostring[0];
		LOGGER.debug(username);
		System.out.println(username);
		return username;
		
	}
	private String generateJwt(String user) {
		LOGGER.info("inside token gen");
//		JwtBuilder builder = Jwts.builder();
		JwtBuilder builder=Jwts.builder();
		builder.setSubject(user);
		builder.setIssuedAt(new Date());
		builder.setExpiration(new Date(new Date().getTime()+1200000));
		builder.signWith(SignatureAlgorithm.HS256,"secretkey");
		String token=builder.compact();
		return token;
	}

	
}
