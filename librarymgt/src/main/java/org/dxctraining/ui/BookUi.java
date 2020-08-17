package org.dxctraining.ui;

import org.dxctraining.Book.entities.Book;
import org.dxctraining.exceptions.BookNotFoundException;
import org.dxctraining.exceptions.InvalidArgumentException;
import org.dxctraining.Book.services.IBookService;
import org.dxctraining.Fiction.entities.FictionBook;
import org.dxctraining.Fiction.services.IFictionBookService;
import org.dxctraining.IT.entities.ItBook;
import org.dxctraining.IT.services.IItBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.dxctraining.Author.entities.Author;
import org.dxctraining.Author.services.IAuthorService;

@Component
public class BookUi {
	 @Autowired
	private IBookService bookService;
	@Autowired
	private IFictionBookService fictionService;
	@Autowired
	private IItBookService itService;
	@Autowired
	private IAuthorService authorService;

	@PostConstruct
	private void runUi() {
		try {
			Author author1 = new Author("linux", "Linus Torvald");
			Author author2 = new Author("java", "james Gosling");
			Author author3 = new Author("C", "yashwant kanetkar");
			author3 = authorService.add(author3);
			String id1 =author3.getId();
			Book book1 = new Book("bid1","name1",111,author3);
			book1= bookService.addBook(book1);
			Author author4 = new Author("C++", "Bjarne Stroustrup");
			author4 = authorService.add(author4);

			
			Book book2 = new Book("bid2","name2",222,author3);
			book2= bookService.addBook(book2);
			
			
			Author a1 = authorService.findById(id1);
			// Set<Book> livingEmployees = a1.getBook();

			FictionBook fictionBook = new FictionBook("1","Mohan",101,author1,"FB1");
			fictionBook = fictionService.save(fictionBook);
			ItBook itBook = new ItBook("2","Sohan",102,author2,"FB2");
			itBook = itService.save(itBook);
			
			String fbId1 = fictionBook.getId();
			FictionBook fetch1 = fictionService.findById(fbId1);
			System.out.println("Fetch = "+fetch1.getName()+" "+fetch1.getId()+" "+fetch1.getCharacter());
			
			  /*for(Book living:Book)
	            {
	                System.out.println("employee living in address=" + living.getName() + " " + living.getAge());
	            }*/

		}catch(BookNotFoundException e){
			e.printStackTrace();
		}catch (InvalidArgumentException e) {
            e.printStackTrace();
        }
	}
	}
/*
		try {
			Author author1 = new Author("linux", "Linus Torvald");
			Author author2 = new Author("java", "james Gosling");
			Author author3 = new Author("C", "yashwant kanetkar");
			Author author4 = new Author("C++", "Bjarne Stroustrup");

			Book book1 = new Book("11", "Mohan", 2000, author1);
			Book book2 = new Book("22", "Sohan", 3000, author2);
			Book book3 = new Book("33", "Rohan", 4000, author3);
			Book book4 = new Book("44", "Gohan", 5000, author4);
			bookService.addBook(book1);
			bookService.addBook(book2);
			bookService.addBook(book3);
			bookService.addBook(book4);

		} catch (BookNotFoundException e) {
			String msg = e.getMessage();
			System.out.print(msg);
		} catch (InvalidArgumentException e) {
			String msg = e.getMessage();
			System.out.print(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		displayAll();
	}

	public void displayAll() {
		List<Book> list = bookService.findAllBook();
		for (Book book : list) {
			display(book);
		}
	}

	public void display(Book book) {
		System.out.println("*******Book and Author Details*************");
		System.out.println("book-- " + book.getId() + " " + book.getName() + " " + book.getCost());
		Author author = book.getAuthor();
		System.out.println("Author " + author.getName() + " Id=" + author.getId());

	}
}*/
