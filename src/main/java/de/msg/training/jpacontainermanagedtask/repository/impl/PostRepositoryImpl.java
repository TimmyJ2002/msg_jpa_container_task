package de.msg.training.jpacontainermanagedtask.repository.impl;

import de.msg.training.jpacontainermanagedtask.model.Post;
import de.msg.training.jpacontainermanagedtask.repository.PostRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class PostRepositoryImpl implements PostRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Post a) {
        em.persist(a);
    }

    @Override
    public Post findById(Long getId) {

        return em.find(Post.class, getId);
    }

    @Override
    public List<Post> findAll() {
        return em.createQuery("SELECT a from Post a", Post.class).getResultList();
    }

    @Override
    public void deleteById(Long id) {
        Post post = em.getReference(Post.class, id);
        em.remove(post);
    }
}
