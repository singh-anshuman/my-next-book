package com.anshu.mynextbook.book.dao;

import org.springframework.data.repository.CrudRepository;

import com.anshu.mynextbook.book.model.Book;

public interface BookDao extends CrudRepository<Book, Long>{
	
}