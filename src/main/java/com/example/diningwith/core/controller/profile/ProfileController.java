package com.example.diningwith.core.controller.profile;

import com.example.diningwith.core.controller.profile.request.CreateProfileRequestDto;
import com.example.diningwith.core.controller.profile.response.ProfileResponseDto;
import com.example.diningwith.core.domain.profile.Profile;
import com.example.diningwith.core.domain.profile.ProfileQueryService;
import com.example.diningwith.core.domain.profile.ProfileRegisterService;
import com.example.diningwith.core.domain.profile.RegisterProfileRequest;
import com.example.diningwith.core.support.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user/{userId}/profile")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileRegisterService profileRegisterService;
    private final ProfileQueryService profileQueryService;

    @PostMapping()
    public void register(
            @PathVariable Long userId,
            @RequestBody CreateProfileRequestDto profileRequestDto) {
        profileRegisterService.register(
                userId,
                new RegisterProfileRequest(
                        profileRequestDto.getNickname(),
                        profileRequestDto.getBio()
                )
        );
    }

    @GetMapping()
    public ApiResponse<ProfileResponseDto> getProfile(
            @PathVariable("userId") Long userId
    ) {
        Profile profile = profileQueryService.readProfile(userId);
        return ApiResponse.ok(new ProfileResponseDto(profile));
    }
}
