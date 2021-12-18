package com.itctc.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class PassengerInfoRequest {

	private String name;
	private String dob;
	private String gender;
	private String doj;
	private String from;
	private String to;
	private String train;

}
