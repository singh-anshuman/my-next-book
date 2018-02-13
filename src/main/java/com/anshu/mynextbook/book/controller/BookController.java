package com.anshu.mynextbook.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anshu.mynextbook.book.model.Book;
import com.anshu.mynextbook.book.service.BookService;

@RestController
@RequestMapping(value="/my-next-book/v1")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	public BookService getBookService() {
		return bookService;
	}
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping(value="/books",method=RequestMethod.GET)
	public ResponseEntity<List<Book>> getAllBooks() {
		return new ResponseEntity<List<Book>>(bookService.getBooks(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/books",method=RequestMethod.POST)
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		return new ResponseEntity<Book>(bookService.addBook(book),HttpStatus.CREATED);
	}
}