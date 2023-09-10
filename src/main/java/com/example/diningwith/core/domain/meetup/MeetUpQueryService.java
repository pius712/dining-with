package com.example.diningwith.core.domain.meetup;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MeetUpQueryService {
    private final MeetUpReader meetUpReader;


    public MeetUp getMeetUp(Long id) {
        return meetUpReader.readById(id);
    }

    public List<MeetUp> getParticipatingMeetUp(Long userId) {
        return meetUpReader.readParticipating(userId);
    }

}
