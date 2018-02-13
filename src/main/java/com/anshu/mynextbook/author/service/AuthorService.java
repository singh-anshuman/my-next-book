package com.anshu.mynextbook.author.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anshu.mynextbook.author.dao.AuthorDao;
import com.anshu.mynextbook.author.model.Author;

@Component
public class AuthorService {
	
	@Autowired
	private AuthorDao authorDao;

	public AuthorDao getAuthorDao() {
		return authorDao;
	}

	public void setAuthorDao(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}
	
	public Author addAuthor(Author author) {
		return authorDao.save(author);
	}
	
}