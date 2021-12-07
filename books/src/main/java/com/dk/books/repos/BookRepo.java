package com.dk.books.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dk.books.models.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {
	
	Book findByTitleContaining(String title);
	
	// Most of these JPA method queries are for visual representation vs. function as they are inherent to the CrudRepository interface and exist implicitly
	
	//These are common to model repo's using JPA: 
	
	// this method retrieves all the books from the database
	List<Book> findAll();
    
	// this method finds books with descriptions containing the search string
    List<Book> findByDescriptionContaining(String search);
    
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
   
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);
    
    Optional<Book> findById(Long id);
	
}
