package com.demo.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Customer {

	private Integer customerId;
	private String customerName;
	private Long customerPhone;

}
