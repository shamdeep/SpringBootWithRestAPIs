package com.demo.binding;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.rest.Customer;

@RestController
public class CustomerRestController {

	@PutMapping(value = "/update", consumes = { "application/json" })
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer) {
		// logic to update customer data int to DB

		System.out.println(customer);
		return new ResponseEntity<>("Updated successfully", HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete/{custId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer custId) {
		// login to delete customer record from database

		System.out.println(custId);
		return new ResponseEntity<>("Deleted successfully", HttpStatus.OK);
	}
}
