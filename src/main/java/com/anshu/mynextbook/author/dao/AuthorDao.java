package com.anshu.mynextbook.author.dao;

import org.springframework.data.repository.CrudRepository;

import com.anshu.mynextbook.author.model.Author;

public interface AuthorDao extends CrudRepository<Author, Long>{
	
}