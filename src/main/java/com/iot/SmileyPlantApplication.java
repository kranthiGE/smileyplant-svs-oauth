package com.iot;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class SmileyPlantApplication{
	private static Logger log = Logger.getLogger(SmileyPlantApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(SmileyPlantApplication.class, args);

		log.info("Smiley-plant Services Started..........");
	}

}
