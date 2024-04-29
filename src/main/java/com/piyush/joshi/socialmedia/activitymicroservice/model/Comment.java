package com.piyush.joshi.socialmedia.activitymicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Comment {
    @Id
    String id;
    String userId;
    String comment;
    String postId;
}
