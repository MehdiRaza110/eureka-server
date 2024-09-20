package com.comment.service.impl;

import com.comment.entity.CommentMe;
import com.comment.payload.CommentDto;
import com.comment.repository.CommentRepository;
import com.comment.service.CommentService;
import com.comment.utill.MapperHere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

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
        LocalDateTime localDateTime=LocalDateTime.now();
        commentMe.setTimestamp(localDateTime);
        CommentMe save = commentRepository.save(commentMe);
        return mapperHere.mapToCommentDto(save);
    }

    @Override
    public List<CommentDto> getComment(long id) {
        List<CommentMe> byUserId = commentRepository.findByUserId(id);
        return byUserId.stream().map(a->mapperHere.mapToCommentDto(a)).collect(Collectors.toList());
    }


}
