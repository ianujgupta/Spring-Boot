package org.dxctraining.IT.dao;

import org.dxctraining.IT.entities.ItBook;

public interface IItBookDao {
	
	public ItBook save(ItBook itBook);
	
	public ItBook findById(String id);
	
}
