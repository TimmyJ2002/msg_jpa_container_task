package de.msg.training.jpacontainermanagedtask.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import de.msg.training.jpacontainermanagedtask.model.Author;
import de.msg.training.jpacontainermanagedtask.repository.AuthorRepository;
import org.hibernate.sql.Select;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class AuthorRepositoryImpl implements AuthorRepository{

	
	//Inject with @PersistenceContext the EntityManager
	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Author a) {
		// Use here the EntityManager to persist the Author object
		em.persist(a);
	}

	@Override
	public List<Author> findAll() {
		//Create here a query, which returns all of the Authors from DB
	//	TypedQuery<Author> q = em.createQuery("select a from Author a", Author.class);
		//HINT: entityManager.createQuery("select a from Author a", Author.class);
		return em.createQuery("select a from Author a", Author.class).getResultList();
	}

}
