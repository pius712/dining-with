package com.example.diningwith.core.domain.meetup;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MeetUpHost {
    private final Long userId;
    private final String nickname;
    private final String bio;


}
