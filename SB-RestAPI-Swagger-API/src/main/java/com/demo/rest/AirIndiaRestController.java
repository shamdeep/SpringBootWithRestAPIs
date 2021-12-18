package com.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.PassengerInfoRequest;
import com.demo.model.TicketInforResponse;

import io.swagger.annotations.ApiParam;

@RestController
//@ApiModel(description = " This API is allows us to book an Ticket for all type travels")
public class AirIndiaRestController {

	//http://localhost:8080/swagger-ui.html
	//@ApiOperation(value = "Book Ticket for passenger",notes =" Provides an passenger Data to book an specific travel type",response = TicketInforResponse.class)
	@PostMapping(
			value = "/book",
			consumes = {
					"applicaiton/json",
					"application/xml"
			},
			produces = {
					"application/json",
					"application/xml"
			}
	)
	public ResponseEntity<TicketInforResponse> bookTicket(@RequestBody PassengerInfoRequest infoRequest) {

		// logic to book ticket

		// Send ticket into in response
		TicketInforResponse response = new TicketInforResponse();
		response.setFname(infoRequest.getFname() + "" + infoRequest.getLname());
		response.setFrom(infoRequest.getFrom());
		response.setTo(infoRequest.getTo());
		response.setJourneyDate(infoRequest.getJourneyDate());
		response.setSuatus("CONFIRMED");
		response.setPrice(14000.00);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}
}
