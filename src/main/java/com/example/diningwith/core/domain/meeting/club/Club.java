package com.example.diningwith.core.domain.meeting.club;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Club {

    private final Long id;
    private final String name;
    private final String description;

    private final ClubHost clubHost;
    private final List<ClubParticipant> clubParticipants;

    private final Long limit;

}

// Club N : 1   ClubParticipant 1: M User