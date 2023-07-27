package de.msg.training.jpacontainermanagedtask.repository;

import java.util.List;

import de.msg.training.jpacontainermanagedtask.model.Author;

public interface AuthorRepository {

	void save(Author a);
	
	List<Author> findAll();


}
