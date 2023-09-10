package com.example.diningwith.core.controller.profile;

import com.example.diningwith.core.controller.profile.request.CreateProfileRequestDto;
import com.example.diningwith.core.domain.profile.ProfileRegisterService;
import com.example.diningwith.core.domain.profile.RegisterProfileRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/user/{userId}/profile")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileRegisterService profileRegisterService;

    @PostMapping()
    public void register(
            @PathVariable Long userId,
            CreateProfileRequestDto profileRequestDto) {
        profileRegisterService.register(
                userId,
                new RegisterProfileRequest(
                        profileRequestDto.getNickname(),
                        profileRequestDto.getNickname()
                )
        );
    }

    @GetMapping()
    public void getProfile() {

    }
}
