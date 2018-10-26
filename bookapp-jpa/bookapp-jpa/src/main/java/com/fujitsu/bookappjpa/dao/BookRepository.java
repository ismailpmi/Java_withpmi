package com.fujitsu.bookappjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fujitsu.bookappjpa.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
