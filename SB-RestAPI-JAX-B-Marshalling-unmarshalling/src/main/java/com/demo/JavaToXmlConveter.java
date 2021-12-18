package com.demo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JavaToXmlConveter {

	public static void main(String[] args) throws JAXBException {

		Book book = new Book(101, "Java", 2300.00);

		JAXBContext context = JAXBContext.newInstance(Book.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(book, System.out);
		// System.out.println();

	}
}
