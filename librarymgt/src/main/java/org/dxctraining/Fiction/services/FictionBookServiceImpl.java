package org.dxctraining.Fiction.services;

import javax.transaction.Transactional;

import org.dxctraining.Fiction.dao.IFictionBookDao;
import org.dxctraining.Fiction.entities.FictionBook;
import org.dxctraining.exceptions.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class FictionBookServiceImpl implements IFictionBookService {
	@Autowired
	private IFictionBookDao dao;

	@Override
	public FictionBook findById(String id) {
		checkId(id);
		FictionBook fictionBook = dao.findById(id);
		return fictionBook;
	}

	public FictionBook save(FictionBook fictionBook) {
		fictionBook = dao.save(fictionBook);
		return fictionBook;
	}

	private void checkId(String id) {
		int idno = Integer.parseInt(id);
		if (idno < 1) {
			throw new InvalidArgumentException("id cant be negative, id passed=" + id);
		}

	}
}
