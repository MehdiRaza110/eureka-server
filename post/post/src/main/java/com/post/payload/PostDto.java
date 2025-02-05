package com.post.payload;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PostDto {
    private long id;
    private String post;
    private long commentId;
    private long userId;
    private LocalDateTime timestamp;
}
