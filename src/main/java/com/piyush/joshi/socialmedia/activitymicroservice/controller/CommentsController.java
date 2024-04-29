package com.piyush.joshi.socialmedia.activitymicroservice.controller;

import com.piyush.joshi.socialmedia.activitymicroservice.model.Comment;
import com.piyush.joshi.socialmedia.activitymicroservice.service.CommentsService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@Slf4j
public class CommentsController {

    @Autowired
    CommentsService commentsService;

    @RequestMapping(value = { "/api/comment/" }, method = RequestMethod.POST)
    public Mono<Comment> addComment(@RequestBody Comment request){
        return commentsService.addComment(request);
    }


    @RequestMapping(value = "/api/comment/post/{postId}", method = RequestMethod.GET)
    public Mono<List<Comment>> getCommentsForPost(@PathVariable String postId){
        return commentsService.getCommentsForPost(postId);
    }


}
