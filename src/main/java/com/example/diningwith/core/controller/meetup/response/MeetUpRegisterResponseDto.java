package com.example.diningwith.core.controller.meetup.response;

import com.example.diningwith.core.domain.meetup.MeetUp;
import com.example.diningwith.core.domain.meetup.MeetUpHost;
import lombok.Getter;

@Getter
public class MeetUpRegisterResponseDto {

    private final Long id;
    private final MeetUpHostDto host;

    private final String name;
    private final String description;

    public MeetUpRegisterResponseDto(MeetUp meetUp) {
        this.id = meetUp.getId();
        this.host = new MeetUpHostDto(meetUp.getHost());
        this.name = meetUp.getName();
        this.description = meetUp.getDescription();
    }


    @Getter
    static class MeetUpHostDto {
        private Long userId;
        private String nickname;
        private String bio;

        public MeetUpHostDto(MeetUpHost meetUpHost) {
            this.userId = meetUpHost.getUserId();
            this.nickname = meetUpHost.getNickname();
            this.bio = meetUpHost.getBio();
        }
    }
}
