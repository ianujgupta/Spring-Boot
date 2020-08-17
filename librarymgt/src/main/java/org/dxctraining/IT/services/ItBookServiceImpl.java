package org.dxctraining.IT.services;

import javax.transaction.Transactional;

import org.dxctraining.IT.dao.IItBookDao;
import org.dxctraining.IT.entities.ItBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class ItBookServiceImpl implements IItBookService {
	@Autowired
	private IItBookDao dao;

	@Override
	public ItBook save(ItBook itBook) {
		itBook = dao.save(itBook);
		return itBook;
	}

	@Override
	public ItBook findById(String id) {
		ItBook itBook = dao.findById(id);
		return itBook;
	}

}
