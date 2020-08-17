package org.dxctraining.Author.services;
import org.dxctraining.Author.entities.Author;


public interface IAuthorService {
	public Author findById(String id);
	
	public Author add(Author author);
	
	public void remove (String id);	
	}
