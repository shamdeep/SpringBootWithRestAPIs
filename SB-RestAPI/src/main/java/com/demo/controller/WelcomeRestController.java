package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping(value = "/welcome", produces = { "application/json" })
	public String getWelcomeMessage() {
		String message = "Welcome to Spring boot Rest";
		return message;
	}
}
