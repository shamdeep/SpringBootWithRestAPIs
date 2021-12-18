package com.itctc.rest;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itctc.binding.PassengerInfoRequest;
import com.itctc.binding.TicketInfoResponse;

@RestController
public class IrctcrestController {

	@PostMapping(
			value = "/bookticket",
			consumes = {
					"application/json",
					"application/xml"
			},
			produces = {
					"application/json",
					"application/xml"
			})
	public ResponseEntity<TicketInfoResponse> bookTicket(@RequestBody PassengerInfoRequest request) {

		// login to book ticket
		TicketInfoResponse response = new TicketInfoResponse();
		response.setStatus("CONFIRMED");
		response.setPrice(1500.00);

		BeanUtils.copyProperties(request, response);

		return new ResponseEntity<>(response,HttpStatus.CREATED);
	}

}
