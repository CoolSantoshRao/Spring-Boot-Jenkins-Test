package com.example.springboot.firstexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstexampleApplicationTests {
	

	@Test
	  void contextLoads() {
		logger.info("we are testing for pipelines ");
		assertEquals(true, true);
		
	}

}
