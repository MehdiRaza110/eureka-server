package com.comment.service;

import com.comment.payload.CommentDto;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CommentService {

    CommentDto addComment(CommentDto commentDto);


    List<CommentDto> getComment(long id);
}
