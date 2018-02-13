package com.anshu.mynextbook.book.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anshu.mynextbook.book.dao.BookDao;
import com.anshu.mynextbook.book.model.Book;

@Component
public class BookService {
	
	@Autowired
	private BookDao bookDao;
	
	public BookDao getBookDao() {
		return bookDao;
	}
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<Book>();
		bookDao.findAll().forEach(books::add);
		return books;
	}
	
	public Book addBook(Book book) {
		return bookDao.save(book);
	}
}