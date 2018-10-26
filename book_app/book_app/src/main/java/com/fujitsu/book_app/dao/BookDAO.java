package com.fujitsu.book_app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.fujitsu.book_app.model.Book;



@Component
public class BookDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void create(Book book) {

		String query = "INSERT INTO BOOKS(CODE,NAME,AUTHOR,DESCRIPTION) VALUES(?,?,?,?)";
		jdbcTemplate.update(query, book.getCode(), book.getName(),book.getAuthor(), book.getDescription());

	}

	public void update(Book book) {

		String query = "UPDATE BOOKS SET DESCRIPTION=? WHERE CODE=?";
		jdbcTemplate.update(query, book.getDescription(), book.getCode());

	}

	public void delete(String code) {

		String query = "DELETE FROM BOOKS WHERE CODE=?";
		jdbcTemplate.update(query, code);

	}

	public Book findByCode(String code) {

		String query = "SELECT CODE,NAME,AUTHOR,DESCRIPTION FROM BOOKS WHERE CODE=?";
		Book book = jdbcTemplate.queryForObject(query, new Object[] { code }, (rs, row) -> {
			Book c = convert(rs);
			return c;
		});
		return book;

	}

	public List<Book> findAll() {

		String query = "SELECT CODE,NAME,AUTHOR,DESCRIPTION FROM BOOKS";
		List<Book> books = jdbcTemplate.query(query, (rs, rows) -> {
			Book book = convert(rs);
			return book;
		});
		return books;
	}

	private Book convert(ResultSet rs) throws SQLException {

		Book book = new Book();
		book.setCode(rs.getString("CODE"));
		book.setName(rs.getString("NAME"));
		book.setAuthor(rs.getString("AUTHOR"));
		book.setDescription(rs.getString("DESCRIPTION"));
		return book;

	}
}
