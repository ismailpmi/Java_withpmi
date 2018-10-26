package com.fujitsu.bookappjpa.controller;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fujitsu.bookappjpa.dao.BookRepository;
import com.fujitsu.bookappjpa.model.Book;




@RestController
@RequestMapping("books")
public class BookController {
	@Autowired
	private BookRepository bookRepository;

	@GetMapping
	public List<Book> findAll() {
		return bookRepository.findAll();

	}
	@GetMapping("{id}")
	public Optional<Book> findone(@PathVariable int id) {
		return bookRepository.findById(id);

	}
	@PostMapping("save")
	public List<Book> save(@RequestBody Book book) {
		bookRepository.save(book);
		return bookRepository.findAll();

	}
	@PutMapping("update")
	public List<Book> update(@RequestBody Book book) {
		bookRepository.save(book);
		return bookRepository.findAll();

	}
	@DeleteMapping("/delete")
	public List<Book> delete(@RequestBody Book book) {
		bookRepository.delete(book);
		return bookRepository.findAll();

	}
//	@GetMapping
//	public void findAll() {
//		System.out.println(bookRepository.findAll());
//
//	}
}
