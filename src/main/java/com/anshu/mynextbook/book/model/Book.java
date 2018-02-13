package com.anshu.mynextbook.book.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.anshu.mynextbook.author.model.Author;

enum Category {
	FICTION, BUSINESS, SPIRITUALITY, BIOGRAPHY, MOTIVATIONAL, OTHER
}

@Entity
@Table(name="BOOK_DETAILS")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="AUTHOR_ID")
	private Author author;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
}

