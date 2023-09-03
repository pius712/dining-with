package com.example.diningwith.core.controller.user;

import com.example.diningwith.core.controller.user.request.SignupRequestDto;
import com.example.diningwith.core.domain.user.CreateUserRequest;
import com.example.diningwith.core.domain.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("signup")
    public Long signup(SignupRequestDto signupRequestDto) {
        return userService.signup(new CreateUserRequest(signupRequestDto.getId(), signupRequestDto.getPassword()));
    }
}
