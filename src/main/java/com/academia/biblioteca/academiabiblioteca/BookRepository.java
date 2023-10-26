package com.academia.biblioteca.academiabiblioteca;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

public interface BookRepository extends JpaRepository<Book, ID>{

}
