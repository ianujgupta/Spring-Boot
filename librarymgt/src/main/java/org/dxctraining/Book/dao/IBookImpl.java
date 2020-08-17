package org.dxctraining.Book.dao;
import org.dxctraining.Book.entities.Book;
import java.util.*;

public interface IBookImpl {
	
	Book addBook(Book book);

	void remove(String id);
	
	public Book updateBook(Book book);

	public Book findBookById(String id);

	Book updateBook(String id, double cost);
}
