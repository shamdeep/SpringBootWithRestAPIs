package com.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class TicketInforResponse {

	private String fname;
	private String lname;
	private String from;
	private String to;
	private String flightId;
	private String journeyDate;
	private String suatus;
	private Double price;
}
