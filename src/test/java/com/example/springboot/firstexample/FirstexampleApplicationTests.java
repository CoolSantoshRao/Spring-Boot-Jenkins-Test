package com.example.springboot.firstexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstexampleApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(FirstexampleApplicationTests.class);

	@Test
	 void contextLoads() {
		logger.info("Test Case Executing....");
		assertEquals(true, true);
		
	}

}
