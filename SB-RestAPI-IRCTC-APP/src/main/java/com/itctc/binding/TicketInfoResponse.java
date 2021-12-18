package com.itctc.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class TicketInfoResponse {

	private String name;
	private String dob;
	private String gender;
	private String doj;
	private String from;
	private String to;
	private String train;
	private String status;
	private Double price;
}
