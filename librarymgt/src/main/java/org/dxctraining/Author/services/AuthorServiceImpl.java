package org.dxctraining.Author.services;

import javax.transaction.Transactional;

import org.dxctraining.Author.dao.IAuthorDao;
import org.dxctraining.Author.entities.Author;
import org.dxctraining.exceptions.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class AuthorServiceImpl implements IAuthorService {
	@Autowired
	private IAuthorDao dao;

	@Override
	public Author findById(String id) {
		checkId(id);
		Author author = dao.findById(id);
		return author;
	}

	@Override
	public Author add(Author author) {
		checkAuthor(author);
		author = dao.add(author);
		return author;
	}

	@Override
	public void remove(String id) {
		checkId(id);
		dao.remove(id);
	}

	private void checkAuthor(Author author) {
		if (author == null) {
			throw new InvalidArgumentException("Author cant be null or empty");

		}
	}

	private void checkId(String id) {
		int idno = Integer.parseInt(id);
		if (idno < 1) {
			throw new InvalidArgumentException("id cant be negative, id passed=" + id);
		}

	}

}
