package com.user.service;

import com.user.entity.User;
import com.user.payload.UserDto;

import java.util.List;

public interface UserService {
    UserDto addUser(UserDto userDto);

    List<User> allUser();
}
