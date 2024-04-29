package com.piyush.joshi.socialmedia.activitymicroservice.service;

import com.piyush.joshi.socialmedia.activitymicroservice.model.Comment;
import com.piyush.joshi.socialmedia.activitymicroservice.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class CommentsService {

    @Autowired
    CommentsRepository commentsRepository;

    public Mono<Comment> addComment(Comment request) {
        request.setId("comment-" + String.valueOf(System.currentTimeMillis()));
        return commentsRepository.save(request);
    }

    public Mono<List<Comment>> getCommentsForPost(String postId) {
        return commentsRepository.getCommentsByPostId(postId).collectList();
//        return Mono.empty();
    }
}
