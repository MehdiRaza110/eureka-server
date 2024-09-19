package com.comment.controller;

import com.comment.payload.CommentDto;
import com.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    private CommentService commentService;
    @RequestMapping("/add")
    public CommentDto addComment(@RequestBody CommentDto commentDto){
        System.out.println(commentDto.getComment());
        System.out.println(commentDto.getPostId());
        CommentDto response=commentService.addComment(commentDto);
        return response;
    }
}
