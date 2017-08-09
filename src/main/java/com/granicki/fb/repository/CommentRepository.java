package com.granicki.fb.repository;

import com.granicki.fb.domain.Comment;
import com.granicki.fb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

/**
 * Created by wojciechgranicki on 29.05.2017.
 */
@RepositoryRestResource
public interface CommentRepository extends MongoRepository<Comment, String> {
    Collection<User> findByAuthor(User author);
}
