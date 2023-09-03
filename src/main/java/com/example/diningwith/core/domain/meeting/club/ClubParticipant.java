package com.example.diningwith.core.domain.meeting.club;

public class ClubParticipant {

    private final Long id;
    private final String nickname;

    private final String bio;
    public ClubParticipant(Long id, String nickname, String bio) {
        this.id = id;
        this.nickname = nickname;
        this.bio = bio;
    }


}
