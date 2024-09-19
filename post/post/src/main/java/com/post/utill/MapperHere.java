package com.post.utill;

import com.post.entity.Post;
import com.post.payload.PostDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MapperHere {
    @Autowired
    public MapperHere(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    private ModelMapper modelMapper;
    public Post mapToPostEntity(PostDto postDto){
        return modelMapper.map(postDto, Post.class);
    }

    public PostDto mapToPostDto(Post post){
        return modelMapper.map(post, PostDto.class);
    }
}
