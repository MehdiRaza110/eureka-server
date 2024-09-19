package com.user.controller;

import com.user.entity.User;
import com.user.payload.UserDto;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }
    private UserService userService;
    @RequestMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody UserDto userDto){

        UserDto results=userService.addUser(userDto);
        return new ResponseEntity<>(results, HttpStatus.CREATED);
    }

    @RequestMapping("all")
    public ResponseEntity<?> allUser(){
        List<User> all=userService.allUser();
        return new ResponseEntity<>(all,HttpStatus.OK);
    }
}
