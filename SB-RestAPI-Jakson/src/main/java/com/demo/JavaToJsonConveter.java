package com.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConveter {

	public static void main(String[] args) throws JsonProcessingException {

		Book book = new Book();
		book.setBookId(101);
		book.setBookName("Java");
		book.setPrice(1000.00);

		// Convert  book java object to Json
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(book);

		System.out.println(json);
	}
}
