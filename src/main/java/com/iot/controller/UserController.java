package com.iot.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iot.model.UserInfo;

@RestController
public class UserController {
	private static Logger log = Logger.getLogger(UserController.class.getName());

	@Autowired
	private ObjectMapper objectMapper;
	
	/**
	 * Retrieve user details
	 * 
	 * @param activeUser
	 * @return
	 */
	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserInfo getUserInfo(@AuthenticationPrincipal OAuth2Authentication activeUser) {
		UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) activeUser
				.getUserAuthentication();

		UserInfo user = objectMapper.convertValue(token.getDetails(), UserInfo.class);

		return user;
	}
	
	
	/**
	 * Method used to test predix-spring-boot-secured-service-example
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/message")
	public Map<?, ?> message() throws Exception {
		try {
			// Map <?,?> response =
			// oauth2RestTemplate.getForObject("http://localhost:8085/",
			// Map.class);
			//
			// log.info("RESPONSE: " + response.toString());
			//
			// return response;
		} catch (HttpClientErrorException e) {
			if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
				// return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
				log.info("ERROR: " + HttpStatus.BAD_REQUEST);
			}
		}

		return new HashMap<String, String>();
	}
}
