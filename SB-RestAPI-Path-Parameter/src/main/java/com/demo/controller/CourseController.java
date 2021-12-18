package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	
	//http://localhost:9090/course/JAVA/trainer/Deepak
	@GetMapping(value = "/course/{cname}/trainer/{tname}")
	public String getCourseDetails(@PathVariable String cname, @PathVariable String tname) {
		String msg = cname + " By " + tname + "  Statring from date ";
		return msg;
	}
}
