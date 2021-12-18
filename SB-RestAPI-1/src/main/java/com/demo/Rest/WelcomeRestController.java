package com.demo.Rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest2")
public class WelcomeRestController {

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String message = "Welcome to SB";
		return message;
	}

	@GetMapping("/hello")
	public ResponseEntity<String> getGreetMessage() {
		String msg = "Hello";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
