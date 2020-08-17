package org.dxctraining.Book.dao;

import org.dxctraining.Book.entities.Book;
import org.dxctraining.exceptions.BookNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class BookImpl implements IBookImpl {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Book addBook(Book book) {
		entityManager.persist(book);
		return book;
	}

	@Override
	public void remove(String id) {
		Book book = findBookById(id);
		entityManager.remove(book);

	}

	@Override
	public Book updateBook(String id, double cost) {
		Book book = entityManager.find(Book.class, id);
		book.setCost(cost);
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		book = entityManager.merge(book);
		return book;
	}

	@Override
	public Book findBookById(String id) {
		Book book = entityManager.find(Book.class, id);
		if (book == null) {
			throw new BookNotFoundException("Book not Found of id " + id);
		}
		return book;

	}

}
