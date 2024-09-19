package com.comment.service;

import com.comment.payload.CommentDto;
import org.springframework.stereotype.Service;


public interface CommentService {

    CommentDto addComment(CommentDto commentDto);
}
