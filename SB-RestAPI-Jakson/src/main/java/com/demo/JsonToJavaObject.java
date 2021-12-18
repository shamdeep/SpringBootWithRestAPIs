package com.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaObject {

	public static void main(String[] args) throws Exception {

		// convert Json to java Object

		File file = new File("Book.json");
		ObjectMapper mapper = new ObjectMapper();
		Book book = mapper.readValue(file, Book.class);
		System.out.println(book);

	}
}
