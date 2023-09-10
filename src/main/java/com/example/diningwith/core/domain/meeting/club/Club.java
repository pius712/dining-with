package com.example.diningwith.core.domain.meeting.club;

import java.util.List;

public record Club(
        Long id,
        String name,
        String description,

        ClubHost clubHost,
        List<ClubParticipant> clubParticipants,

        Long limit
) {


}

// Club N : 1   ClubParticipant 1: M User