package org.dxctraining.IT.services;

import org.dxctraining.IT.entities.ItBook;

public interface IItBookService {

	public ItBook save(ItBook itBook);
	
	public ItBook findById(String id);
	
}
