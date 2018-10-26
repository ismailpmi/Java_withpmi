package com.fujitsu.book_app.model;

import lombok.Data;

@Data
public class Book {
	private String code;
	private String name;
	private String author;
	private String description;
}
