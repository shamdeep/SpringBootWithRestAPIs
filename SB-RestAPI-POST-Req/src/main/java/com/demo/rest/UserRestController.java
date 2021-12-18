package com.demo.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bindings.User;

@RestController
public class UserRestController {

	@PostMapping(
			value = "/user",
			consumes = {"application/xml","application/json"},
			produces = { "text/plain" }
	)
	public String adduser(@RequestBody User user) {
		System.out.println(user);
		String msg = "User Saved Successfully";
		return msg;

	}
}
