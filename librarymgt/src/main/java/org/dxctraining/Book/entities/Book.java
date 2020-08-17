package org.dxctraining.Book.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.dxctraining.Author.entities.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "books")
public class Book {
	@Id
	protected String id;
	private String name;
	private double cost;
	@ManyToOne
	private Author author;

	public Book() {
		this("","",50,null);
	}

	public Book(String id, String name, double cost, Author author) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.author = author;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		int hashId = id.hashCode();
		return hashId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if ((obj == null) || !(obj instanceof Book)) {
			return false;
		}

		Book that = (Book) obj;
		boolean isequal = this.id.equals(that.id);
		return isequal;
	}
}
