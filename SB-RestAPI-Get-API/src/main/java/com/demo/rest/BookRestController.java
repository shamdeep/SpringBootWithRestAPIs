package com.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Book;

@RestController
public class BookRestController {

	@GetMapping("/book")
	public Book getBookData() {
		Book book = new Book(101, "JAva", 800.00);
		return book;
	}
}
