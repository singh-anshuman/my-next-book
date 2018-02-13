package com.anshu.mynextbook.author.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anshu.mynextbook.author.model.Author;
import com.anshu.mynextbook.author.service.AuthorService;

@RestController
@RequestMapping(value="/my-next-book/v1")
public class AuthorController {
	
	@Autowired
	private AuthorService authorService;

	public AuthorService getAuthorService() {
		return authorService;
	}

	public void setAuthorService(AuthorService authorService) {
		this.authorService = authorService;
	}
	
	@RequestMapping(value="authors",method=RequestMethod.POST)
	public ResponseEntity<Author> addAuthor(@RequestBody Author author) {
		return new ResponseEntity<Author>(authorService.addAuthor(author),HttpStatus.CREATED);
	}
	
}