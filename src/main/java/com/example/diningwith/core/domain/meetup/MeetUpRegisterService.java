package com.example.diningwith.core.domain.meetup;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MeetUpRegisterService {

    private final MeetUpWriter meetUpWriter;


    public MeetUp register(Long userId, RegisterMeetUpRequest registerMeetUpRequest) {
        return meetUpWriter.write(userId, registerMeetUpRequest);
    }
}
