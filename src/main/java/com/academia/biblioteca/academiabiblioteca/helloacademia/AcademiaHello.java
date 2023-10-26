package com.academia.biblioteca.academiabiblioteca.helloacademia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controler
@RestController
public class AcademiaHello {

	//Simple mapping
	@GetMapping (path = "/academia")
	public String helloAcademia() {
		return "Bom Dia, estamos na Biblioteca da Academia";
	}
	
	//Simple Java Bean mapping
	@GetMapping(path = "/academia-bean")
	public HelloAcademiaBean helloAcademiaBean() {
		return new HelloAcademiaBean("Bom Dia, estamos na Biblioteca da Academia mas com Java Beans");
	}
	
	//Simple mapping with Path and Variable
	@GetMapping(path = "/academia/path-variable/{name}")
	public HelloAcademiaBean helloAcademiaPathVariable(@PathVariable String name) {
		return new HelloAcademiaBean(String.format("Bom Dia Academia, %s", name));
	}
	
}
