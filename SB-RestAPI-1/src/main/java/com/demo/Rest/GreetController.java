package com.demo.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest1")
public class GreetController {

	@GetMapping(value = "/greet")
	public String getGreetMsg() {
		String message = "Welcome to Spring boot application";
		return message;
	}

	@GetMapping("/wish")
	public String getWish() {
		String msg = "Good Morninig";
		return msg;
	}
}
