package com.academia.biblioteca.academiabiblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AcademiaDaoService {
	private static List<Book> books = new ArrayList<>();
	
	private static int booksCount = 3;
	
	static {
		books.add(new Book(1, "O Senhor dos Anéis", "J.R.Tolkien"));
		books.add(new Book(2, "A Guerra dos Tronos", "George Martin"));
		books.add(new Book(3, "Os Mais", "Eça de Queirós"));
		books.add(new Book(4, "Academia Java Microserviços", "Filipe Brito"));
		
	}
	
	public List<Book> findAll(){
		return books;
	}
	
	public Book save(Book book) {
		if (book.getId() == null) {
			book.setId(++booksCount);
		}
		books.add(book);
		return book;
	}
	
	public Book findOne(int id) {
		for (Book book: books) {
			if (book.getId() == id) {
				return book;
			} //end if
		} //end for
		return null;
	}
	
	public Book deleteById(int id) {
		Iterator<Book> iterator = books.iterator();
		while (iterator.hasNext()) {
			Book book = iterator.next();
			if (book.getId() == id) {
				iterator.remove();
				return book;
			}
		}
		return null;
 	}
}
