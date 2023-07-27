package de.msg.training.jpacontainermanagedtask.repository;

import de.msg.training.jpacontainermanagedtask.model.Post;

import java.util.List;

public interface PostRepository {

    void save(Post a);

    Post findById(Long id);

    List<Post> findAll();

    void deleteById(Long id);
}
