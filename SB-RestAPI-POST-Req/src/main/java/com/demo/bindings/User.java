package com.demo.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class User {

	private Integer uid;
	private String fname;
	private String lname;
	private String email;
}
