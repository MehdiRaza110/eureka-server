package com.user.payload;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PostDto {
    private long id;
    private String comment;
    private long postId;
    private long userId;
    private LocalDateTime timestamp;
}
