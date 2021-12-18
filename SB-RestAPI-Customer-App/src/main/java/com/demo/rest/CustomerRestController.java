package com.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.binding.Customer;

@RestController
public class CustomerRestController {

	@GetMapping(value ="/customer",produces = {"application/json","application/xml"})
	public Customer getCustomerData() {
		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("Deepak");
		customer.setCustomerPhone(123243l);

		return customer;
	}
}
