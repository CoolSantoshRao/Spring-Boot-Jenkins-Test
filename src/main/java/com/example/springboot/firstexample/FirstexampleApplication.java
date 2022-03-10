package com.example.springboot.firstexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FirstexampleApplication {
	
	private static Logger logger=LoggerFactory.getLogger(FirstexampleApplication.class);
	
	

	public static void main(String[] args) {
		logger.info("Before Execute Main");
		SpringApplication.run(FirstexampleApplication.class, args);
		logger.info("Execute Main");
	
	}

}
