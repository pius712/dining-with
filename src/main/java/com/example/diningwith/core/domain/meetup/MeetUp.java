package com.example.diningwith.core.domain.meetup;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MeetUp {

    private final Long id;
    private final MeetUpHost host;

    private final String name;
    private final String description;

    private final String address;

}
