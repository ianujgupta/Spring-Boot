package org.dxctraining.Author.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.dxctraining.Book.entities.Book;

@Table(name = "authors")
@Entity
public class Author {
	@Id
	@GeneratedValue
	private String id;
	private String name;
	//private Book book;

	//@OneToMany(targetEntity=Book.class,mappedBy = "author")
	//private Set<Book> books;

	public Author(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Author(){}
	

	
/*
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
