package com.piyush.joshi.socialmedia.activitymicroservice.repository;

import com.piyush.joshi.socialmedia.activitymicroservice.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CommentsRepository extends ReactiveMongoRepository<Comment,String> {

    public Flux<Comment> getCommentsByPostId(String postId);
}
