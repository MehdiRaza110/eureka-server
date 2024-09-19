package com.user.utill;

import com.user.entity.User;
import com.user.payload.UserDto;
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
    public User mapToUserEntity(UserDto postDto){
        return modelMapper.map(postDto, User.class);
    }

    public UserDto mapToUserDto(User user){
        return modelMapper.map(user, UserDto.class);
    }
}
