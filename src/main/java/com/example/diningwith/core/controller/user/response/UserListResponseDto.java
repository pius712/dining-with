package com.example.diningwith.core.controller.user.response;

import com.example.diningwith.core.domain.user.User;
import lombok.Getter;

import java.util.List;

@Getter
public class UserListResponseDto {

    List<UserResponseDto> users;

    public UserListResponseDto(List<User> users) {
        this.users = users.stream().map(UserResponseDto::new).toList();
    }
}
