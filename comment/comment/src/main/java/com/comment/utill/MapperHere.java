package com.comment.utill;

import com.comment.entity.CommentMe;
import com.comment.payload.CommentDto;
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

    public CommentMe mapToCommentEntity(CommentDto commentDto){
        return modelMapper.map(commentDto, CommentMe.class);
    }

    public CommentDto mapToCommentDto(CommentMe commentMe){
        return modelMapper.map(commentMe, CommentDto.class);
    }
}
