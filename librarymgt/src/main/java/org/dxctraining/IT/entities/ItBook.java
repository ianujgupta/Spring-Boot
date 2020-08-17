package org.dxctraining.IT.entities;

import org.dxctraining.Book.entities.Book;

import javax.persistence.Entity;

import org.dxctraining.Author.entities.Author;

@Entity
public class ItBook extends Book {

	private String languages;

	public ItBook(String id, String name, double cost, Author author, String languages) {
		super(id, name, cost, author);
		this.languages = languages;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		if (!super.equals(o))
			return false;
		ItBook that = (ItBook) o;
		return this.getId() == that.getId();
	}

	@Override
	public int hashCode() {
		int hashId = id.hashCode();
		return hashId;
	}
}
