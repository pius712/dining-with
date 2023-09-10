package com.example.diningwith.core.controller.user.response;

import com.example.diningwith.core.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserResponseDto {
    private Long id;

    public UserResponseDto(User user) {
        this.id = user.id();
    }
}
