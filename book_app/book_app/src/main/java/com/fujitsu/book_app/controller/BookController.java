package com.fujitsu.book_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fujitsu.book_app.dao.BookDAO;
import com.fujitsu.book_app.model.Book;

@CrossOrigin
@RestController
public class BookController {
	@Autowired
	private BookDAO bookDAO;

	@GetMapping("/book")
	public List<Book> getCustomers() {

		return bookDAO.findAll();

	}

	@GetMapping("/book/{code}")
	public ResponseEntity<?> getCourse(@PathVariable("code") String code) {

		Book book = bookDAO.findByCode(code);
		if (book == null) {
			return new ResponseEntity<>("No book found for code " + code, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(book, HttpStatus.OK);

	}

	@PostMapping(value = "/book")
	public ResponseEntity<?> createBook(@RequestBody Book book) {
		// System.out.println(course);

		bookDAO.create(book);
		return new ResponseEntity<>(book, HttpStatus.OK);

	}

	@DeleteMapping("/book/{code}")
	public ResponseEntity<?> deleteCourse(@PathVariable String code) {

		bookDAO.delete(code);
		return new ResponseEntity<>(code, HttpStatus.OK);

	}

	@PutMapping(value = "/book/{code}")
	public ResponseEntity<?> updateCustomer(@PathVariable String code, @RequestBody Book book) {
		// System.out.println("Updating");
		bookDAO.update(book);
		return new ResponseEntity<>(book, HttpStatus.OK);

	}
}
