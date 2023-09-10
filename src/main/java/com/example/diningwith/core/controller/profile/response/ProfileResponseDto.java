package com.example.diningwith.core.controller.profile.response;

import com.example.diningwith.core.domain.profile.Profile;

public record ProfileResponseDto(
        String nickname,
        String bio
) {
    public ProfileResponseDto(Profile profile) {
        this(profile.getNickname(), profile.getBio());
    }
}
