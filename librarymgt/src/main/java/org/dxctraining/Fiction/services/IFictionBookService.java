package org.dxctraining.Fiction.services;

import org.dxctraining.Fiction.entities.FictionBook;

public interface IFictionBookService {

	public FictionBook save(FictionBook fictionbook);

	public FictionBook findById(String id);
}
