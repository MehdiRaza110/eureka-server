package com.user.payload;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class UserDto {

    private long id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDateTime registeredAt;
}
