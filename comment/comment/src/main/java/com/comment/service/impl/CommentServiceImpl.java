package com.comment.service.impl;

import com.comment.entity.CommentMe;
import com.comment.payload.CommentDto;
import com.comment.repository.CommentRepository;
import com.comment.service.CommentService;
import com.comment.utill.MapperHere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    public CommentServiceImpl(MapperHere mapperHere,CommentRepository commentRepository){
        this.commentRepository=commentRepository;
        this.mapperHere=mapperHere;
    }

    private MapperHere mapperHere;
    private CommentRepository commentRepository;
    @Override
    public CommentDto addComment(CommentDto commentDto) {
        CommentMe commentMe = mapperHere.mapToCommentEntity(commentDto);
        CommentMe save = commentRepository.save(commentMe);
        return mapperHere.mapToCommentDto(save);
    }
}
