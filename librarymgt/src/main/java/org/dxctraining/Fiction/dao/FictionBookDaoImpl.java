package org.dxctraining.Fiction.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.dxctraining.Fiction.entities.FictionBook;
import org.springframework.stereotype.Repository;

@Repository
public class FictionBookDaoImpl implements IFictionBookDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public FictionBook save(FictionBook fictionBook) {
		fictionBook = entityManager.merge(fictionBook);
		return fictionBook;
	}

	@Override
	public FictionBook findById(String id) {
		FictionBook fictionBook = entityManager.find(FictionBook.class,id);
		return fictionBook;
	}

}
