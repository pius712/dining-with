package com.example.diningwith.core.controller.meetup.response;

import com.example.diningwith.core.domain.meetup.MeetUp;
import lombok.Getter;

@Getter
public class MeetUpResponseDto {

    private String name;
    private String description;
    private String address;

    public MeetUpResponseDto(MeetUp meetUp) {
        this.name = meetUp.getName();
        this.description = meetUp.getDescription();
        this.address = meetUp.getAddress();
    }
}
