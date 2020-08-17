package org.dxctraining.Author.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.dxctraining.Author.entities.Author;
import org.dxctraining.exceptions.AuthorNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorDaoImpl implements IAuthorDao {
	@PersistenceContext
	private EntityManager entityManager; 
	@Override
	
	public Author findById(String id) {
		Author author = entityManager.find(Author.class, id);
		if(author==null) {
			throw new AuthorNotFoundException("Author can't be null"+ id);
		}
		return author;
	}

	@Override
	public Author add(Author author) {
		entityManager.persist(author);
		return author;
	}

	@Override
	public void remove(String id) {
		Author author = findById(id);
		entityManager.remove(author);
		
	}

}
