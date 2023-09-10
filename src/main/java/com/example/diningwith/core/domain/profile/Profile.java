package com.example.diningwith.core.domain.profile;

public record Profile(
        Long id,
        Long userId,
        String nickname, String bio) {

}
