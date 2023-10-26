package com.academia.biblioteca.academiabiblioteca;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookDbControler {
	
	@Autowired
	private AcademiaDaoService service;
	
	@Autowired
	private BookRepository bookRepository;
	
	
	@GetMapping("/db/books")
	public List<Book> retrieveAllBooks(){
		return bookRepository.findAll();
		
	}
	
	@GetMapping("/db/book/{id}")
	//public Book retrieveLivro(@PathVariable int id) throws BookNotFoundException {
	//ver porquê na documentação !!
	public Book retrieveLivro(@PathVariable int id) {
		Book book = service.findOne(id);
		if (book == null)
			throw new BookNotFoundException("Não foi encontrado o Livro com o ID: " + id);
		
		return book;
	}	
	
	@DeleteMapping("/db/book/{id}")
	public void deleteBook(@PathVariable int id) {
		Book book = service.deleteById(id);
		if (book == null)
			throw new BookNotFoundException("Não foi encontrado o Livro com o ID: " + id);
		
	}	
	
	//input -> criar (POST) com detalhes do book
    //output -> Return the created URI com os detalhes do book criado
	@PostMapping("/db/book")
	public void createBook(@RequestBody Book book) {
		Book savedBook = service.save(book);
	}
}
