package com.example.diningwith.core.domain.profile;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Profile {
    private final Long id;

    private final Long userId;

    private final String nickname;
    private final String bio;

}
