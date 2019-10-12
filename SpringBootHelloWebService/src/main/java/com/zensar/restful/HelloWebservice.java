package com.zensar.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebservice {
	@GetMapping("/hello")
	public String sayHello()
	{
		return "welcome to zensar service using spring boot";
	}

}
