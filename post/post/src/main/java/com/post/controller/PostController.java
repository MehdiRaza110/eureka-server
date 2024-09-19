package com.post.controller;

import com.post.payload.PostDto;
import com.post.service.PostService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    public PostController(PostService postService) {
        this.postService = postService;
    }

    private PostService postService;
    @RequestMapping("/add")
    public PostDto addPost(@RequestBody PostDto postDto){
        return postService.addPost(postDto);
    }

    @RequestMapping("/get")

    public List<PostDto> getPost(@PathVariable("/{id}") long id){
        List<PostDto> res= postService.getPost(id);
        return res;
    }
}
