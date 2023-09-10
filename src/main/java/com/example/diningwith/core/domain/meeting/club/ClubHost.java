package com.example.diningwith.core.domain.meeting.club;

/**
 * 클럽의 호스트
 */
public record ClubHost(
        Long userId,
        String nickname,
        String bio
) {

}
