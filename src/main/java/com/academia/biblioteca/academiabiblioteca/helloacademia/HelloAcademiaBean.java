package com.academia.biblioteca.academiabiblioteca.helloacademia;

public class HelloAcademiaBean {
	private String message;

	public HelloAcademiaBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloAcademiaBean [message=" + message + "]";
	}
	
}
