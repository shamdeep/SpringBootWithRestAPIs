package com.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	// http://localhost:9090/course?name=SBMD
	@GetMapping(value = "/course")
	public String getCourseDetails(@RequestParam("name") String name) {

		String msg = "";

		if ("SBMD".equals(name)) {

			msg = "New batch for SBMS from date";
		} else if ("JRTP".equals(name)) {
			msg = "New batch for JRTP from date";
		} else if ("AWS".equals(name)) {
			msg = "New batch for AWS from date";
		} else {
			msg = " Please visit our website";
		}
		return msg;
	}

	//http://localhost:9090/fee?name=SBMD&tname=deepak
	@GetMapping(value = "/fee")
	public String getCourseFees(@RequestParam("name") String name, @RequestParam("tname") String tname) {

		String msg = name + "By" + tname + " Fees is 5000 rs";
		return msg;

	}
}
