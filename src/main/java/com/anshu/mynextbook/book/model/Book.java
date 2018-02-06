package com.anshu.mynextbook.book.model;

enum Category {
	FICTION, BUSINESS, SPIRITUALITY, BIOGRAPHY, MOTIVATIONAL, OTHER
}

public class Book {
	private Long id;
	private String title;
	private String Author;
	private Category category;
	
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
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
}

