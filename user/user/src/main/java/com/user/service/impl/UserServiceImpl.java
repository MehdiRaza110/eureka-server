package com.user.service.impl;

import com.user.entity.User;
import com.user.payload.UserDto;
import com.user.repository.UserRepository;
import com.user.service.UserService;
import com.user.utill.MapperHere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private MapperHere mapperHere;

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDto addUser(UserDto userDto) {

        LocalDateTime currentDateTime = LocalDateTime.now();
        User user = mapperHere.mapToUserEntity(userDto);
        user.setRegisteredAt(currentDateTime);
        User save = userRepository.save(user);
        return mapperHere.mapToUserDto(save);
    }

    @Override
    public List<User> allUser() {
        return userRepository.findAll();
    }
}
