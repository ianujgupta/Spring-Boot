package org.dxctraining.Author.dao;

import org.dxctraining.Author.entities.Author;

public interface IAuthorDao {

	public Author findById(String id);
	
	public Author add(Author author);
	
	public void remove (String id);
}

