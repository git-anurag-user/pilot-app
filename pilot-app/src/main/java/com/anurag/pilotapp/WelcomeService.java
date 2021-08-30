package com.anurag.pilotapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeService {
	
	@GetMapping(value="/welcome")
	public String greet(){
		return "Welcome to App running in docker container...";
	}

}
