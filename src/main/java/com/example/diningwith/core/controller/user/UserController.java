package com.example.diningwith.core.controller.user;

import com.example.diningwith.core.controller.user.request.SignupRequestDto;
import com.example.diningwith.core.controller.user.response.UserListResponseDto;
import com.example.diningwith.core.controller.user.response.UserResponseDto;
import com.example.diningwith.core.domain.user.CreateUserRequest;
import com.example.diningwith.core.domain.user.User;
import com.example.diningwith.core.domain.user.UserService;
import com.example.diningwith.core.support.response.ApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("signup")
    public ApiResponse<UserResponseDto> signup(@Valid @RequestBody() SignupRequestDto signupRequestDto) {
        log.info("body {}", signupRequestDto);
        User user = userService.signup(new CreateUserRequest(signupRequestDto.getId(), signupRequestDto.getPassword()));

        return ApiResponse.ok(new UserResponseDto(user));
    }

    @GetMapping("list")
    public ApiResponse<UserListResponseDto> getList() {

        List<User> users = userService.getList();
        return ApiResponse.ok(new UserListResponseDto(users));
    }
}
