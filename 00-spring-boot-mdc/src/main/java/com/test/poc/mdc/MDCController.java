package com.test.poc.mdc;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MDCController {
	private static final Logger logger = LoggerFactory.getLogger(MDCController.class);

	@GetMapping("/add/{firstNumber}/{secondNumber}")
	public Results adAdd(@PathVariable int firstNumber, @PathVariable int secondNumber) {
		MDC.put("UUID", UUID.randomUUID().toString());
		MDC.put("firstNumber", Integer.toString(firstNumber));
		MDC.put("secondNumber", Integer.toString(secondNumber));
		logger.info("Inside add numbers");
		
		Results results = new Results(firstNumber, secondNumber, firstNumber + secondNumber);
		MDC.put("Final Results", Integer.toString(results.getSum()));
		
		logger.info("Exiting add numbers");
		
		return results;
	}
}
