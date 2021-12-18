package com.demo.model;

//@XmlRootElement
public class Book {

	public Book() {
		// TODO Auto-generated constructor stub
	}

	private Integer bookId;
	private String bookName;
	private Double price;

	public Book(Integer bookId, String bookName, Double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
