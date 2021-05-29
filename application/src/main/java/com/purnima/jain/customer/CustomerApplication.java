package com.purnima.jain.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.purnima.jain.customer.model")
@SpringBootApplication(scanBasePackages = "com.purnima.jain.customer")
public class CustomerApplication {

	private static final Logger logger = LoggerFactory.getLogger(CustomerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
		logger.info("CustomerApplication Started........");
	}

}
