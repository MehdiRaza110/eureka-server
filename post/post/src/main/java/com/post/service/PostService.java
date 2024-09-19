package com.post.service;

import com.post.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto addPost(PostDto postDto);

    List<PostDto> getPost(long id);
}
