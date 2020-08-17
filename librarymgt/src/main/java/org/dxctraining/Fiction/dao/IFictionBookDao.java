package org.dxctraining.Fiction.dao;

import org.dxctraining.Fiction.entities.*;

public interface IFictionBookDao {

	public FictionBook save(FictionBook fictionbook);

	public FictionBook findById(String id);

}
