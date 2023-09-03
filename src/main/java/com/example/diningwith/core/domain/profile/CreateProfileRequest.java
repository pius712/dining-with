package com.example.diningwith.core.domain.profile;

public record CreateProfileRequest(
        String nickname,
        String bio
) {
}
