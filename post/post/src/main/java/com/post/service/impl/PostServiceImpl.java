package com.post.service.impl;

import com.post.entity.Post;
import com.post.payload.PostDto;
import com.post.repository.PostRepository;
import com.post.service.PostService;
import com.post.utill.MapperHere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
public class PostServiceImpl implements PostService {
    @Autowired
    public PostServiceImpl(MapperHere mapperHere, PostRepository postRepository) {
        this.mapperHere = mapperHere;
        this.postRepository = postRepository;
    }

    private MapperHere mapperHere;
private PostRepository postRepository;
    @Override
    public PostDto addPost(PostDto postDto) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        Post post = mapperHere.mapToPostEntity(postDto);
        post.setTimestamp(currentDateTime);
        Post save = postRepository.save(post);
        return mapperHere.mapToPostDto(save);
    }

    @Override
    public List<PostDto> getPost(long id) {

        List<Post> res=postRepository.findByUserId(id);
        List<PostDto> lst=res.stream().map(a->mapperHere.mapToPostDto(a)).collect(Collectors.toList());
        return lst;
    }
}
