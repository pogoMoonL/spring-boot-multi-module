package com.purnima.jain.customer;

//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ThisWillActuallyRun {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
