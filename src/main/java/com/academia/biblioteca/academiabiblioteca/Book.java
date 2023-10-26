package com.academia.biblioteca.academiabiblioteca;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Add DB Table
@Entity

public class Book {
	
	//O Valor do ID é gerado pela BD
	@Id
	@GeneratedValue
	
	Integer id;
	String nome;
	String autor;	
	
	//Construtor necessário para a Entity Book
	public Book() {
	}

	public Book(Integer id, String nome, String autor) {
		super();
		this.id = id;
		this.nome = nome;
		this.autor = autor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", nome=" + nome + ", autor=" + autor + "]";
	}
	
	
}
