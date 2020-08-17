package org.dxctraining.Fiction.entities;

import javax.persistence.Entity;

import org.dxctraining.Author.entities.Author;
import org.dxctraining.Book.entities.Book;

@Entity
public class FictionBook extends Book {

	private String character;

	public FictionBook(String id, String name, double cost, Author author, String character) {
		super(id, name, cost, author);
		this.character = character;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		FictionBook that = (FictionBook) o;
		return that.getId() == this.getId();
	}

	@Override
	public int hashCode() {
		int hashId = id.hashCode();
		return hashId;
	}

}