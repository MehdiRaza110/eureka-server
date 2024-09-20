package com.comment.controller;

import com.comment.payload.CommentDto;
import com.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        CommentDto response=commentService.addComment(commentDto);
        return response;
    }
    @RequestMapping("/get/{id}")
    public List<CommentDto> getComment(@PathVariable("id") long id){
       return commentService.getComment(id);
    }

}
