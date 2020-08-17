package org.dxctraining.Book.services;

import org.dxctraining.exceptions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import org.dxctraining.Book.dao.*;
import org.dxctraining.Book.entities.*;

@Transactional
@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	private IBookImpl dao;

	@Override
	public Book findBookById(String id) {
		Book book = dao.findBookById(id);
		return book;
	}

	@Override
	public Book addBook(Book book) {
		validate(book);
		book = dao.addBook(book);
		return book;
	}

	@Override
	public void remove(String id) {
		dao.remove(id);
	}

	@Override
	public Book updateBook(Book book) {
		book = dao.updateBook(book);
		return book;
	}

	@Override
	public Book updateBook(String id, double cost) {
		validateCost(cost);
		Book book = dao.updateBook(id, cost);
		return book;
	}

	void validateName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidArgumentException("Book name can't be null or empty");
		}
	}

	void validate(Object o) {
		if (o == null) {
			throw new InvalidArgumentException("Book Id can't be null or empty");
		}
	}

	void validateCost(double cost) {
		if (cost < 0) {
			throw new BookcostException("cost can not be -ve");
		}

	}

}
