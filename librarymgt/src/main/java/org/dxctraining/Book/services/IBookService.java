package org.dxctraining.Book.services;
import org.dxctraining.Book.entities.*;

public interface IBookService {
	Book addBook(Book book);

	void remove(String id);
	
	public Book updateBook(Book book);

	public Book findBookById(String id);

	public Book updateBook(String id, double cost);
	
}
