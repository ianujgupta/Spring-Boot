package org.dxctraining.IT.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.dxctraining.IT.entities.ItBook;
import org.springframework.stereotype.Repository;

@Repository
public class ItBookDaoImpl implements IItBookDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public ItBook save(ItBook itBook) {
		itBook = entityManager.merge(itBook);
		return itBook;
	}

	@Override
	public ItBook findById(String id) {
		ItBook itBook = entityManager.find(ItBook.class,id);
		return itBook;
	}

}
